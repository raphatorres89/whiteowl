document.addEventListener("DOMContentLoaded", function () {

    const canvas = document.getElementById('magicCanvas');
    if (!canvas) return; // segurança

    const ctx = canvas.getContext('2d');

    let particles = [];

    function resize() {
        canvas.width = window.innerWidth;
        canvas.height = window.innerHeight;
    }

    window.addEventListener('resize', resize);
    resize();

    for (let i = 0; i < 60; i++) {
        particles.push({
            x: Math.random() * canvas.width,
            y: Math.random() * canvas.height,
            r: Math.random() * 2,
            d: Math.random() * 0.5
        });
    }

    function draw() {
        ctx.clearRect(0, 0, canvas.width, canvas.height);

        particles.forEach(p => {
            ctx.beginPath();
            ctx.fillStyle = "rgba(124, 58, 237, 0.7)";
            ctx.arc(p.x, p.y, p.r, 0, Math.PI * 2);
            ctx.fill();
        });

        update();
    }

    function update() {
        particles.forEach(p => {
            p.y -= p.d;
            if (p.y < 0) {
                p.y = canvas.height;
                p.x = Math.random() * canvas.width;
            }
        });
    }

    function animate() {
        draw();
        requestAnimationFrame(animate);
    }

    animate();
});
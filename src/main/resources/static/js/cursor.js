document.addEventListener("DOMContentLoaded", function () {

    // 🚫 Desativa em mobile
    if (window.innerWidth < 768) return;

    const container = document.getElementById('cursorTrail');
    if (!container) return;

    let particles = [];

    document.addEventListener('mousemove', (e) => {
        particles.push({
            x: e.clientX,
            y: e.clientY,
            life: 1
        });
    });

    function animate() {
        container.innerHTML = '';

        particles.forEach((p, i) => {

            const el = document.createElement('div');

            el.style.position = 'fixed';
            el.style.left = p.x + 'px';
            el.style.top = p.y + 'px';
            el.style.width = '6px';
            el.style.height = '6px';
            el.style.borderRadius = '50%';
            el.style.pointerEvents = 'none';

            // 🔮 cor arcana (dourado + roxo misto)
            el.style.background = `rgba(201,169,110,${p.life})`;
            el.style.boxShadow = `0 0 8px rgba(124,58,237,${p.life})`;

            el.style.transform = 'translate(-50%, -50%)';

            container.appendChild(el);

            p.life -= 0.05;
        });

        // remove partículas mortas
        particles = particles.filter(p => p.life > 0);

        requestAnimationFrame(animate);
    }

    animate();
});
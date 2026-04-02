function toggleMenu() {
    const menu = document.getElementById('mobileMenu');
    const overlay = document.getElementById('overlay');

    menu.classList.toggle('translate-x-full');
    overlay.classList.toggle('opacity-0');
    overlay.classList.toggle('pointer-events-none');
}
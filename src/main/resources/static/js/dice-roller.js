document.addEventListener("DOMContentLoaded", () => {

    const toggle = document.getElementById("dice-toggle");
    const options = document.getElementById("dice-options");

    const resultModal = document.getElementById("dice-result");
    const resultCard = document.getElementById("dice-result-card");
    const resultText = document.getElementById("dice-result-text");

    const diceButtons = document.querySelectorAll(".dice-button");

    let menuOpen = false;

    function openMenu() {

        menuOpen = true;

        options.classList.remove(
            "opacity-0",
            "pointer-events-none",
            "translate-x-4"
        );

        options.classList.add(
            "opacity-100",
            "translate-x-0"
        );
    }

    function closeMenu() {

        menuOpen = false;

        options.classList.remove(
            "opacity-100",
            "translate-x-0"
        );

        options.classList.add(
            "opacity-0",
            "pointer-events-none",
            "translate-x-4"
        );
    }

    function rollDice(sides) {

        return Math.floor(Math.random() * sides) + 1;

    }

    function showResult(sides, result) {

        resultText.textContent = `d${sides} → ${result}`;

        resultModal.classList.remove(
            "opacity-0",
            "pointer-events-none"
        );

        resultCard.classList.remove("scale-95");
        resultCard.classList.add("scale-100");

    }

    function hideResult() {

        resultModal.classList.add(
            "opacity-0",
            "pointer-events-none"
        );

        resultCard.classList.remove("scale-100");
        resultCard.classList.add("scale-95");

    }

    toggle.addEventListener("click", () => {

        if (menuOpen) {
            closeMenu();
        } else {
            openMenu();
        }

    });

    diceButtons.forEach(button => {

        button.addEventListener("click", () => {

            const sides = Number(button.dataset.dice);

            const result = rollDice(sides);

            closeMenu();

            showResult(sides, result);

        });

    });

    resultModal.addEventListener("click", event => {

        if (event.target === resultModal) {
            hideResult();
        }

    });

});
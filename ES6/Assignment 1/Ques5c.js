let displayLetter = function(letters) {

    for (const letter of letters) {
        console.log(letter.charAt(0).toUpperCase() + letter.slice(1));
    }
}

let letters = ["p", "f", "w", "i", "j"];

displayLetter(letters)
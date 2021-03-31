var string = ["James", "Ivan", "Jack"]
var getValue = function(names) {
    for (let i = 0; i < string.length; i++) {
        names = string;
        console.log("Name: ", names[i], "Length: ", i + 1);
    }
};
getValue();
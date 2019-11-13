const fs = require("fs");

const data = require("./dados.json").data;

const item = data
    .map(
        (a) =>
            `${a.name} ; ${a.brand} ; ${a.category} ; ${a.price} ; ${a.currency} ; ${a.color} \n`
    )
    .join("");

fs.writeFile(__dirname + "/ecommerce-mock.txt", item, "utf8", (err) =>
    err ? console.log(err) : console.log("Dados escritos")
);

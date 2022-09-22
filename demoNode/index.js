console.log("Hello world")

//Array of objects
const groceryList = [
    {
        name: "Turkey",
        type: "Meat"
    },
    {
        name: "Roma tomato",
        type: "Produce"
    },
    {
        name: "Sweet onion",
        type: "Produce"
    },
    {
        name: "Soy Milk",
        type: "Dairy"
    }
];

// push, pop, slice, shift, unshift
groceryList.push({name:"Mushroom", type: "Produce"});

console.log("After push method:", groceryList)

console.log("Slice method: ", groceryList.slice(-3, -1));

// The shift() method removes the first item of an array.
groceryList.shift();

// The unshift() method adds new elements to the beginning of an array; overwrites the original array.
groceryList.unshift({name:"Garlic", type:"Produce"})

// filter, print using forEach on the array
groceryList.filter(item => item.type === "Produce").forEach(item => console.log("Filter + ForEach Method: ", item))
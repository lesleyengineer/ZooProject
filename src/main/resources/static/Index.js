let div = document.querySelector('.home');
function getData(url, callback) {

let jsonData;
fetch(url)
.then((response) => response.json())
.then((data) => (jsonData = data))
.then(() => callback(jsonData.data))
.catch((error) => console.log(error));
}

getData('localhost:9001/read', useData);
function useData(arrOfObjs) {
const animalContainer = document.createElement('div');
div.appendChild(animalContainer);
console.log(arrOfObjs);
arrOfObjs.forEach((animal) => {
const pName = document.createElement('p');
const pHabitat = document.createElement('p');
const pFood = document.createElement('p');
const pFood = document.createElement('p');
pName.innerText = animal.name;
pHabitat.innerText = animal.habitat;
pFood.innerFood = animal.food
pAge.innerAge = animal.age
animalContainer.appendChild(pName);
animalContainer.appendChild(pHabitat);
animalContainer.appendChild(pFood);
animalContainer.appendChild(pAge);
div.appendChild(personContainer);
}
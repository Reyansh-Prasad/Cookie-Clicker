// script.js

// Starting values
let cookieCount = 0;
let upgradesOwned = 0;
const cookiesPerClick = 1;  // Initial cookies per click
const upgradeCost = 10;     // Cost for the first upgrade

// Get references to HTML elements
const cookieCountElement = document.getElementById('cookie-count');
const upgradeCountElement = document.getElementById('upgrade-count');
const cookieButton = document.getElementById('cookie-button');
const upgradeButton = document.getElementById('upgrade-button');

// Update the display with the current cookie count
function updateDisplay() {
  cookieCountElement.textContent = cookieCount;
  upgradeCountElement.textContent = upgradesOwned;
}

// Function for cookie button click
cookieButton.addEventListener('click', () => {
  cookieCount += cookiesPerClick;
  updateDisplay();
});

// Function to buy upgrade
upgradeButton.addEventListener('click', () => {
  if (cookieCount >= upgradeCost) {
    // Subtract the cost of the upgrade from cookie count
    cookieCount -= upgradeCost;
    
    // Increase the number of upgrades owned
    upgradesOwned++;
    
    // Each upgrade increases cookies per click
    cookiesPerClick += 1; // Or adjust based on your desired upgrade effect
    
    // Increase the cost of the next upgrade
    upgradeCost = Math.floor(upgradeCost * 1.5);  // Example cost inflation

    updateDisplay();
  } else {
    alert('You need more cookies to buy this upgrade!');
  }
});

// Initialize display
updateDisplay();

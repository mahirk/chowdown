Parse.initialize("0UqzDuXvUOIME43yM6bY2O8MBL2K3o7CWtlGHF4C", "pWNEupugERZcsGBEGmTGmXKccCeJfanF0pNuylaa"); 
var inUse;
var userInformation = Parse.Object.extend("Chowdown");
var inUse = new Object();
inUse.initialAmt;
inUse.currentAmt;
inUse.daysLeft;
var query = new Parse.Query(userInformation);
query.get(//userID, {
  success: function(moneyDeets) {
    inUse.initialAmt = moneyDeets.get("initialAmt");
    inUse.currentAmt = moneyDeets.get("currentAmt");
    inUse.daysLeft = Math.abs(new Date() - moneyDeets.get("daysLeft"));
  },
  error: function(object, error) {
    alert('Sorry, there was an error in retrieving the data. Please try again.');
  }
});
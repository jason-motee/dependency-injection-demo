function Ship(port){
    this.currentPort = port;
}

Ship.prototype.getShip = function() {
    return this.ship;
}

Ship.prototype.getCurrentPort = function() {
    return this.currentPort;
}


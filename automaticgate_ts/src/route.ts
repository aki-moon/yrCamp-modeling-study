class Route {
    constructor(
      private _startStation: Station,
      private _exitStation: Station
    ) {}
  
    get startStation(): Station {
      return this._startStation;
    }
  
    get exitStation(): Station {
      return this._exitStation;
    }
  
    isCovered(): boolean {
      // Implementation
      return false;
    }
}
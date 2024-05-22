export abstract class ElectronicPass {
    constructor(
      private _balance: Number,
      private _autoCharge: boolean,
      private _route: Route,
      private _expirationDate: Date,
      private _entrainStation: Station
    ) {}
  
    get balance(): Number {
      return this._balance;
    }
  
    get autoCharge(): boolean {
      return this._autoCharge;
    }
  
    get route(): Route {
      return this._route;
    }
  
    get expirationDate(): Date {
      return this._expirationDate;
    }
  
    get entrainStation(): Station {
      return this._entrainStation;
    }
  
    abstract charge(): void;
    abstract debit(): void;
  }
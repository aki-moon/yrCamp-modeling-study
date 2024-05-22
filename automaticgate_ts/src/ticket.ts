import { ElectronicPass } from "./electronicPass";

  export abstract class Ticket {
    constructor(
      private _side: Side,
      private _route: Route,
      private _expirationDate: Date,
      private _entrainStation: Station
    ) {}
  
    get side(): Side {
      return this._side;
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
  
    abstract arrangeSide(): void;
  }
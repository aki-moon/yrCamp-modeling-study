class Station {
    constructor(
      private _name: string,
      private _code: number,
      private _lineList: Line[]
    ) {}
  
    get name(): string {
      return this._name;
    }
  
    get code(): number {
      return this._code;
    }
  
    get lineList(): Line[] {
      return this._lineList;
    }
}
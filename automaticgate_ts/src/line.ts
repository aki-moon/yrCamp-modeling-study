class Line {
    constructor(private _name: string, private _code: number) {}
  
    get name(): string {
      return this._name;
    }
  
    get code(): number {
      return this._code;
    }
}
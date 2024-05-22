import { ElectronicPass } from "./electronicPass";
import { Ticket } from "./ticket";

class AutomaticGate {
    constructor(
      private passReader: PassReader,
      private ticketReader: TicketReader,
      private automaticGateStation: Station,
      private door: Door,
      private electronicPass: ElectronicPass,
      private ticket: Ticket
    ) {}
  
    start(): void {
      // Implementation
    }
  
    stop(): void {
      // Implementation
    }
  
    open(): void {
      // Implementation
    }
  
    close(): void {
      // Implementation
    }
  
    notifyAlert(): void {
      // Implementation
    }
  
    coveredCommuterPass(): boolean {
      // Implementation
      return false;
    }
  
    coveredTicket(): boolean {
      // Implementation
      return false;
    }
  
    fare(): Number {
      // Implementation
      return 0;
    }
  
    debit(): void {
      // Implementation
    }
  
    punchTicket(): void {
      // Implementation
    }
  
    printTicket(): void {
      // Implementation
    }
}
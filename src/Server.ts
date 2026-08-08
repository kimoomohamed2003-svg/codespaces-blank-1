import express, { Express } from "express";
import { GetStudent } from "./routes/GetStudent";

export class Server {
  private app: Express;
  private port: number;

  constructor(port: number = 5005) {
    this.app = express();
    this.app.use(express.json());
    this.port = port;
    this.setupRoutes();
  }

  private setupRoutes() {
    
  // student get

    this.app.get("/students", (req, res) => {
      const getStudentserver = new GetStudent();
      getStudentserver.handleRequest(req, res);
    });
  }

  public start(port: number) {
    this.app.listen(port, () => {
      console.log(`Server is running on http://localhost:${port}`);
    });
  }
}

export default Server;

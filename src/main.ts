import { Server } from "./Server";

const port = Number(process.env.PORT) || 5005;
const server = new Server();
server.start(port);

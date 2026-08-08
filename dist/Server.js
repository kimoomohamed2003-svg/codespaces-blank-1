"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Server = void 0;
const express_1 = __importDefault(require("express"));
const GetStudent_1 = require("./routes/GetStudent");
class Server {
    constructor() {
        this.app = (0, express_1.default)();
        this.configureMiddleware();
        this.configureRoutes();
    }
    configureMiddleware() {
        this.app.use(express_1.default.json());
    }
    configureRoutes() {
        const getStudent = new GetStudent_1.GetStudent();
        this.app.get("/api/students/:studentId", getStudent.handleRequest.bind(getStudent));
    }
    start(port) {
        this.app.listen(port, () => {
            console.log(`Server is running on http://localhost:${port}`);
        });
    }
}
exports.Server = Server;

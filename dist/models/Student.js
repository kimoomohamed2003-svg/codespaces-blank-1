"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.Student = void 0;
const fs_1 = __importDefault(require("fs"));
const path_1 = __importDefault(require("path"));
class Student {
    constructor(id, name, email, age, isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.isActive = isActive;
    }
    // Getter and Setter for name
    getName() {
        return this.name;
    }
    setName(name) {
        this.name = name;
    }
    // Getter and Setter for email
    getEmail() {
        return this.email;
    }
    setEmail(email) {
        this.email = email;
    }
    // Getter and Setter for age
    getAge() {
        return this.age;
    }
    setAge(age) {
        this.age = age;
    }
    // Getter and Setter for isActive
    getIsActive() {
        return this.isActive;
    }
    setIsActive(isActive) {
        this.isActive = isActive;
    }
    getStudentId() {
        return this.id;
    }
    static getStudentFromDB(id) {
        const dataPath = path_1.default.join(__dirname, "../../data/students.json");
        const rawData = fs_1.default.readFileSync(dataPath, "utf-8");
        const students = JSON.parse(rawData);
        for (let i = 0; i < students.length; i++) {
            const s = students[i];
            if (s.id === id) {
                return new Student(s.id, s.name, s.email, s.age, s.isActive);
            }
        }
        return undefined;
    }
}
exports.Student = Student;

import fs from "fs";
import path from "path";

export class Student {
  private id: number;
  private name: string;
  private email: string;
  private age: number;
  private isActive: boolean;

  constructor(id: number, name: string, email: string, age: number, isActive: boolean) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.age = age;
    this.isActive = isActive;
  }

  // Getter and Setter for name
  public getName(): string {
    return this.name;
  }

  public setName(name: string): void {
    this.name = name;
  }

  // Getter and Setter for email
  public getEmail(): string {
    return this.email;
  }

  public setEmail(email: string): void {
    this.email = email;
  }

  // Getter and Setter for age
  public getAge(): number {
    return this.age;
  }

  public setAge(age: number): void {
    this.age = age;
  }

  // Getter and Setter for isActive
  public getIsActive(): boolean {
    return this.isActive;
  }

  public setIsActive(isActive: boolean): void {
    this.isActive = isActive;
  }

  public getStudentId(): number {
    return this.id;
  }



  public static getStudentFromDB(id: number): Student | undefined {  




    
    const dataPath = path.join(__dirname, "../../data/students.json");
    const rawData = fs.readFileSync(dataPath, "utf-8");
    const students = JSON.parse(rawData) as Array<{ id: number; name: string; email: string; age: number; isActive: boolean }>;

    for (let i = 0; i < students.length; i++) {
      const s = students[i];
      if (s.id === id) {
        return new Student(s.id, s.name, s.email, s.age, s.isActive);
      }
    }

    return undefined;
  }
}

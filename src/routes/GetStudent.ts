import { Request, Response } from "express";
import { Student } from "../models/Student";   


export class GetStudent {
  public handleRequest(req: Request, res: Response): void {
    const studentId = req.params.studentId || (req.query.studentId as string);

    if (!studentId) {
      res.status(400).json({ error: "Missing studentId" });
      return;
    }
  

    // Convert studentId to number
        const studentidnumber = Number(studentId);
        if (isNaN(studentidnumber)) {
            res.status(400).json({ error: "Invalid studentId" });
            return;
        }





    const student = Student.getStudentFromDB(studentidnumber);

    if (!student) {
      res.status(404).json({ error: "Student not found" });
      return;
    }

    

    
    res.json({
      studentId,
      name: student.getName(),
      email: student.getEmail(),
      age: student.getAge(),
      isActive: student.getIsActive(),
      grade: "A",
    });
  }
}

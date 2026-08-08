"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GetStudent = void 0;
class GetStudent {
    handleRequest(req, res) {
        const studentId = req.params.studentId || req.query.studentId;
        if (!studentId) {
            res.status(400).json({ error: "Missing studentId" });
            return;
        }
        // TODO: Fetch student data from database or service
        // For now, return a mock response
        res.json({
            studentId,
            name: "John Doe",
            grade: "A",
        });
    }
}
exports.GetStudent = GetStudent;

package by.itechart.service.student;

import by.itechart.mapping.dto.StudentDto;
import by.itechart.model.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student) throws Throwable;

    Student getStudentByIdAndClassId(Long studentId, Long classId) throws Throwable;

    Student updateStudent(Long studentId, Student student, Long classId) throws Throwable;

    void deleteStudentByIdAndClassId(Long studentId, Long classId);

    List<Student> findAllStudents(Long classId);
}

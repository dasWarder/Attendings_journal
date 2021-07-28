package by.itechart.repository;

import by.itechart.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;


public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    List<Student> findAllBySchoolClass_Id(Long classId, Pageable pageable);

    Optional<Student> getStudentByIdAndSchoolClass_Id(Long studentId, Long classId);

    void deleteStudentByIdAndSchoolClass_Id(Long studentId, Long classId);

    List<Student> findAllBySchoolClass_Id(Long classId);

}

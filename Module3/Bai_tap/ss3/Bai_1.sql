use quan_li_sinh_vien;
select * from student 
where student_name like '% h%';

select * from class
where month(start_date) = 12;

select * from `subject`
where credit between 3 and 5;

update student
set class_id = 2 
where student_name = 'Hung';

select student.student_name, `subject`.subject_name, mark.mark
from student
join mark on student.student_id = mark.student_id
join `subject` on mark.subject_id = `subject`.subject_id
group by mark.mark_id
order by mark desc, student_name;
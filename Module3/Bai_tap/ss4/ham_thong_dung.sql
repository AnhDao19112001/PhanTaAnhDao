use quan_li_sinh_vien;

select * from `subject`
where credit = (select max(credit) from `subject`);

select sub.*, m.mark from `subject`
sub join mark m on sub.subject_id = m.subject_id
where m.mark = (select max(mark) from mark);

select stud.*, avg(m.mark) as avg_mark
from student stud join mark m on stud.student_id = m.student_id
group by student_id
order by avg_mark desc;
select  c.name as department,count(s.courseId) as count
from course c,studentcourse s
where c.id=s.courseId
group by c.id
order by count desc,department asc;
select * from studentcourse;
select * from facultycourse;
select * from course;

select c.name from course c,facultycourse fc
where c.id =fc.courseId;

select sc.startdate as 'years' ,count(s.id) as 'total_students'
from student s,studentcourse sc
where s.id =sc.studentId
group by sc.startDate
order by years asc,total_students desc;

select c.name,count(f. id)
from course c, faculty f,facultycourse fc
where c.id =fc.courseId
and fc.facultyId = f.id
group by c.id;

SELECT c.name, count(*)
FROM course c
LEFT JOIN facultycourse f ON c.id = f.courseId
GROUP BY c.name
HAVING COUNT(*) = 6
ORDER BY c.name ASC;

select c.name ,count(f.facultyId)
from course c,facultycourse f
where c.id = f.courseID
group by c.name
having COUNT(f.facultyId) = 6
order by c.name asc;

select * from facultycourse;

SELECT c.name, COUNT(sc.studentID) AS num_students
FROM course c
LEFT JOIN studentcourse sc ON c.id = sc.courseId
GROUP BY c.name
HAVING COUNT(*) > 0 -- AND COUNT(sc.faculty_id) = 0
ORDER BY num_students DESC; -- , c.course_name ASC;

SELECT c.name, COUNT(sc.studentID) AS num_students
FROM course c,studentcourse sc,facultycourse fc
where c.id =sc.courseId
and c.id = fc.courseId
group by c.name
HAVING COUNT(*) > 0  AND COUNT(fc.facultyId) = 0
ORDER BY num_students DESC  , c.name ASC;

select count(distinct s.id) as 'students',monthname(sc.startdate) as 'months'
from student s,studentcourse sc
where s.id = sc.studentId
group by monthname(sc.startdate)
  having months = 'august'
 order by months asc,students desc;
 
 
 SELECT
  YEAR(startDate) AS year,
  COUNT(*) AS total_students
FROM studentcourse
WHERE month(startDate) = 8
GROUP BY year(startDate)
ORDER BY YEAR(startDate) ASC,total_students asc;
 
 select * from studentcourse;
 
 select
startDate as year,
count(distinct studentId ) as total_students
from studentcourse 
where month(startDate) = 8
group by startDate
order by startDate ASC,total_students asc;

select firstname,lastname 
from student s,department d
where s.majorId = d.id;
select * from student;

select s.firstname ,c.name
from student s,course c,department d
where s.majorId = d.id
and d.id = c.deptId;

select  majorId from student,department 
where majorId = department.id;
select * from department;

select  c.name  from course  c where deptId ='2';


select distinct c.name, s.firstname
from student s,course c,department d
where s.majorId = 2;


select c.name, round(avg(sc.progress),1) as average_progress
from course c
inner join studentcourse sc on c.id = sc.courseId
group by c.id
order by average_progress desc,c.name asc;

SELECT c.name, AVG(sc.progress) AS average_progress
FROM course c
INNER JOIN studentcourse sc ON c.id = sc.courseId
GROUP BY c.id
ORDER BY average_progress DESC
LIMIT 1;

select c.name,round(avg(sc.progress),1) as avg_progress
from course c,studentcourse sc
where c.id = sc.courseId
group by c.id
order by avg_progress desc
limit 1;

select s.firstname,s.lastname ,round(avg(sc.progress),1) as average_progress
from student s,studentcourse sc
where s.id = sc.studentId
group by s.id 
order by average_progress desc,firstname asc,lastname asc;

SELECT faculty.firstname, faculty.lastname, AVG(student_course.progress) AS average_progress
FROM faculty
INNER JOIN course ON faculty.id = course.faculty_id
INNER JOIN student_course ON course.id = student_course.course_id
GROUP BY faculty.id;

select  f.firstname,f.lastname,round(avg(sc.progress),1)as average_progress
from faculty f ,course c,facultycourse fc,studentcourse sc
where f.id = fc.facultyId
and fc.courseId = c.id
and c.id =sc.courseId
group by  f.id
order by average_progress desc,firstname asc,lastname desc;

select s.firstname,s.lastname,max(sc.progress),min(sc.progress)  ,
CASE
  WHEN max(sc.progress) >= 70 THEN 'A'
  WHEN max(sc.progress)< 70 THEN 'B'
  WHEN max(sc.progress)< 60 THEN 'C'
  WHEN max(sc.progress)<  50 THEN 'D'
  ELSE 'F'
END AS grade1,
case
  WHEN max(sc.progress) >= 70 THEN 'A'
  WHEN max(sc.progress)< 70 THEN 'B'
  WHEN max(sc.progress)< 60 THEN 'C'
  WHEN max(sc.progress)< 50 THEN 'D'
  ELSE 'F'
end as grade2
from student s,studentcourse sc
where s.id= sc.studentId
group by s.id;


select s.firstname,s.lastname,max(sc.progress),min(sc.progress),
case
  when max(sc.progress) >= 70 then 'A'
  when max(sc.progress) < 70 and max(sc.progress) >= 60 Then 'B'
  when max(sc.progress) < 60 and max(sc.progress) >= 50 then 'C'
  when max(sc.progress) < 50 and max(sc.progress) >= 40  then 'D'
  else 'F'
end as maximumgrade,
case
  when min(sc.progress) >= 70 then 'A'
  when min(sc.progress)< 70 and min(sc.progress) >= 60 then 'B'
  when min(sc.progress)< 60 and min(sc.progress) >= 50 then 'C'
  when min(sc.progress)< 50 and min(sc.progress) >= 40 then'D'
  else 'F'
end as minimumgrade
from student s,studentcourse sc
where s.id= sc.studentId
group by s.id
order by min(sc.progress) desc,max(sc.progress)desc,firstname asc,lastname asc;

select s.firstname,s.lastname,count(sc.courseId)
from student s,studentcourse sc,course c,department d
 where s.majorId = d.id
 and s.id =sc.studentId
and sc.courseId = c.id
group by s.id;
-- having s.id = d.id;
 select  Id from faculty where Id = 0;
 select  facultyId from facultycourse where facultyId = 0;
 select * from facultycourse;
 select * from faculty where id not in (
 select distinct  fc.facultyId from facultycourse fc);
 
--  Qn: 4
-- name of course number of faculty asigned to it is zero
 select  name from course 
 where id 
 not in(select distinct courseId from facultycourse)
 order by name asc;
 
 
 -- qn 5:
 -- course name ,number of student in that course where no faculty assigned
 select c.name ,count(sc.studentId) as count
 from course c,studentcourse sc
 where c.id = sc.courseId
 and c.id not in(select distinct courseId from facultycourse)
 group by c.name
 order by count desc, name asc;
 
 -- QN  13:
 
select s.firstname,s.lastname,
case
  when min(sc.progress) >= 70 then 'A'
  when min(sc.progress)< 70 and min(sc.progress) >= 60 then 'B'
  when min(sc.progress)< 60 and min(sc.progress) >= 50 then 'C'
  when min(sc.progress)< 50 and min(sc.progress) >= 40 then'D'
  else 'F'
end as minimumgrade,
case
  when max(sc.progress) >= 70 then 'A'
  when max(sc.progress) < 70 and max(sc.progress) >= 60 Then 'B'
  when max(sc.progress) < 60 and max(sc.progress) >= 50 then 'C'
  when max(sc.progress) < 50 and max(sc.progress) >= 40  then 'D'
  else 'F'
end as maximumgrade

from student s,studentcourse sc
where s.id= sc.studentId
group by s.id
order by minimumgrade desc,maximumgrade desc,firstname asc,lastname asc;

SELECT
  s.firstname AS "First Name",s.lastname AS "Last Name",
  COUNT(sc.studentid) AS "Number of Courses in Major"
FROM student s
INNER JOIN studentcourse sc ON s.id = sc.studentid
INNER JOIN course c ON sc.courseid = c.id
WHERE c.deptid = s.majorid
GROUP BY s.id
ORDER BY "Number of Courses in Major" DESC, s.firstname ASC,lastname asc;

select s.firstname,s.lastname,count(sc.studentId) as counts
from student s,studentcourse sc,course c,department d
where s.majorId = c.id
and s.id =sc.studentId
and sc.courseId = c.id
group by s.id
order by counts desc,s.firstname asc,s.lastname asc;
 
 -- QN 8:
 -- firstname,lastname,number of courses they are taking in their major
 select s.firstname as firstname,s.lastname as lastname,count(sc.courseId) as counts
 from student s,studentcourse sc,course c
 where s.id = sc.studentId
 and c.id = sc.courseId
 and c.deptId = s.majorId
 group by s.id 
 order by counts desc,firstname asc,lastname asc;
 
 -- QN 2:
 -- each department and number of courses offered by that department
 select d. name as deparment, count(c.name) as count from department d,course c
where d.id =c.deptid
group by d.name
order by count, d.name ;

-- QN 3: name of each course and number of students in that course
SELECT c.name as department,count(s.courseId) as count
from course c,studentcourse s
where c.id=s.courseID
group by c.id
order by count desc,department asc;

-- Qn 6:
-- total number of students enrolled in classes during each school year
select  count(distinct s.id) as 'Students',YEAR(sc.startdate )as 'Year'
from student s,studentcourse sc
where s.id = sc.studentID
group by year(sc.startdate)
order by Year asc,Students desc;

-- QN 7:
-- startdate ,tot no of students who enrolled in classes in august of each year
select
startDate as year,
count(distinct studentId ) as total_students
from studentcourse 
where month(startDate) = 8
group by startDate
order by startDate ASC,total_students asc;

-- QN 9:
-- first name ,last name ,avg prog of all students acheiving avg progress less tahn 50
select firstname, lastname, round(avg(progress),1) as average_progress
from student s
inner join studentcourse sc on s.id = sc.studentId
group by s.id
having avg(sc.progress) < 50
order by average_progress desc, firstname asc,lastname asc;

-- Qn 10:
-- course name and avg progress of students in tht course
select c.name, round(avg(sc.progress),1) as average_progress
from course c
inner join studentcourse sc on c.id = sc.courseId
group by c.id
order by average_progress desc,c.name asc;

-- QN 11:
-- course name,avg student progress of the course with the highest average progress
select c.name,round(avg(sc.progress),1) as avg_progress
from course c,studentcourse sc
where c.id = sc.courseId
group by c.id
order by avg_progress desc
limit 1;

-- QN 12:
-- first name,last name ,avg progress made over all of their courses
select  f.firstname,f.lastname,round(avg(sc.progress),1)as average_progress
from faculty f ,course c,facultycourse fc,studentcourse sc
where f.id = fc.facultyId
and fc.courseId = c.id
and c.id =sc.courseId
group by  f.id
order by average_progress desc,firstname asc,lastname desc;

select * from employees















select Email
from Person
group by Email
having count(Email) > 1;

/*
select Email
from (select Email, count(Email) as Num
      from Person
      group by Email) as statistic
where Num > 1;
*/
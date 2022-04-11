select
    score,
    dense_rank() over (order by score desc) as "rank"
from
    Scores;
/*
将查询到的数据根据顺序排号，相同分数的序号相同， 序号不间断，1 1 2 3 3 4这种
利用 dense_rank() over函数可以实现
与另外两个计算序号的函数的对比
1.rank() over：排名相同的两名是并列，但是占两个名次，1 1 3 4 4 6这种
2.dense_rank() over：排名相同的两名是并列，共占一个名词，1 1 2 3 3 4这种
3.row_number() over这个函数不需要考虑是否并列，哪怕根据条件查询出来的数值相同也会进行连续排名 1 2 3 4 5
*/

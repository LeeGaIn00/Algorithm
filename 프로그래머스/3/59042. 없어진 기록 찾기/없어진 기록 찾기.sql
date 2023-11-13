-- 코드를 입력하세요
SELECT a.animal_id, a.name
from animal_outs a
where animal_id not in (select animal_id from animal_ins)
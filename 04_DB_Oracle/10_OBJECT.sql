/*
시퀀스(SEQUENCE)
- 번호를 자동으로 생성하는 객체
-주로 PK값 자동 생성

CREATE SEQUENCE 시퀀스명
STAT WITH 시작값(기본값1)
INCREMENT BY 증가값(기본값1)
MAXVALUE 최대값(기본값 큼)
MINVALUE 최소값(기본값 1)
CYCLE | NOCYCLE(기본값 NOCYCLE) -- 값 순환여부 확인
CACHE | NOCACHE(기본값 CACHE 20)--캐시메모리 할당 여부
*캐시메모리
-미리 발생된 값들을 생성해서 저장해두는 공간
-매번 호출될 때마다 새로 번호를 생성하는 게 아니라 캐시메모리 공간에 미리 생성된 값들을 가져다 쓸 수 있음(속도가 빨라짐)
-접속이 해제되면-> 캐시메모리에 미리 만들어 둔 번호들은 다 날라감

*객체 명칭
테이블명: TB_
시퀀스명 : SEQ_
뷰명 : VW_
트리거명: TRG_
*/

CREATE SEQUENCE SEQ_EMPID
START WITH 300
INCREMENT BY 5
MAXVALUE 310
NOCYCLE
NOCACHE;

--현재 계정이 소유하고 있는 시퀀스들의 구조를 보고자 할 때
SELECT * FROM USER_SEQUENCES;

/*
시퀀스명.CURRVAL:현재 시퀀스 값
시퀀스명.NEXTVAL:시퀀스값에 일정값을 증가시켜서 발생된 값
                시퀀스명.CURRVAL + INCREMENT BY 값  
*/
--CURRVAL는 한번이라도 NEXTVAL가 수행하지 않으면 가져올 수 없음
SELECT SEQ_EMPID.CURRVAL FROM DUAL;
--MAXVALUE가 초과하고 NOCYCLE인 경우
SELECT SEQ_EMPID.NEXTVAL FROM DUAL;

/*
시퀀스 변경

ALTER SEQUENCE 시퀀스명
STAT WITH 시작값
INCREMENT BY 증가값
MAXVALUE 최대값)
MINVALUE 최소값)
CYCLE | NOCYCLE
CACHE | NOCACHE 바이트크기;

->START WTTH는 변경 불가!
*/
ALTER SEQUENCE SEQ_EMPID
INCREMENT BY 10
MAXVALUE 400;

SELECT SEQ_EMPID.NEXTVAL FROM DUAL;

/*
시퀀스 삭제
DROP SEQUENCE 시퀀스명
*/

DROP SEQUENCE SEQ_EMPID;

/*
시퀀스명 :SEQ_TEST
시작값 300
증가 값 1 
최대값 1000
순환 없음
캐시 사용 없음
*/
CREATE SEQUENCE SEQ_TEST
START WITH 300
INCREMENT BY 1
MAXVALUE 1000
NOCYCLE
NOCACHE;

/*
뷰(VIEW)
-SELECT문을 저장할 수 있는 객체
-가상 테이블(실제 데이터가 담겨있는건 아님-> 논리적인 테이블)
-DML(INSERT,UPDATE,DELETE) 작업 가능 (단,일부만) 

*사용 목적
-편리성: SELECT문의 복잡도 완화
-보안성: 테이블의 특정 열을 노출하고 싶지 않은 경우
*/
-- '한국'에서 근무하는 사원들의 사번,이름,부서명,급여,근무국가명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING(NATIONAL_CODE)
WHERE NATIONAL_NAME = '한국';

-- '중국'에서 근무하는 사원들의 사번,이름,부서명,급여,근무국가명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING(NATIONAL_CODE)
WHERE NATIONAL_NAME = '중국';
-- '일본'에서 근무하는 사원들의 사번,이름,부서명,급여,근무국가명 조회
SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING(NATIONAL_CODE)
WHERE NATIONAL_NAME = '일본';

/*
뷰 생성

CREATE OR REPLACE FORCE | NOFORCE VIEW 뷰명
AS 서브쿼리
WITH CHECK OPTION
WITH READ ONLY

*VIEW 옵션들 
-OR REPLACE : 뷰 생성시 기존에 중복된 이름의 뷰가 없다면 새로 뷰 생성,
기존에 중복된 이름의 뷰가 있다면 해당 뷰 변경 옶션
-FORCE :서브 쿼리에 기술된 테이블이 존재하지 않는 테이블이어도 뷰 생성
-NOFORCE: 서브 쿼리에 기술된 테이블이 존재해야만 뷰 생성(기본값)
-WITH CHECK OPTION: 서브 쿼리에 기술된 조건에 부합하지 않는 값으로 수정하는 경우 오류 발생
-WITH READ ONLY: 뷰에ㅔ 대해 조회만 가능(DML 수행 불가)
*/

--관리자 계정으로 CRATE VIEW 권한 부여
ALTER SESSION SET CONTAINER =XEPDB1;
GRANT CREATE VIEW TO kh;
CREATE VIEW VM_EMPLOYEE
AS SELECT EMP_ID, EMP_NAME, DEPT_TITLE, SALARY
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE)
JOIN NATIONAL USING(NATIONAL_CODE);

-- '한국'에서 근무하는 사원들의 사번,이름,부서명,급여,근무국가명 조회
SELECT * FROM VM_EMPLOYEE
WHERE NATIONAL_NAME ='한국';
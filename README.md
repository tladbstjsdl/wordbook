# wordbook
## 자동 변역 기능이 있는 단어장을 만들고 수정
### 사용 기술: Springboot 2.4.1, Kotlin 1.4.21, Thymeleaf 2.4.1, JPA 2.4.1, Oracle 18c xe, Spring Security 2.4.1


> 주요기능
>> 1. 로그인
>>> * 유효성 검사
>>> * 비동기 데이터 전송, 상황에 따른 경고창 출력
>>> * 아이디, 비밀번호 찾기?(미정)
>> 2. 회원가입
>>> * 유효성 검사
>>> * 주소 오픈 API 적용(예정)
>>> * 메일 전송으로 본인확인?(미정)
>> 3. 단어장 리스트(예정)
>>> * 리스트 페이징
>>>> - 중요 단어장 설정(비동기)
>>>> - 단어장 정렬(날짜, 단어장 이름, 중요 단어장 등 / 비동기)
>>>> - 중요 단어장만 표시
>>> * 권한 확인
>>> * 단어장 생성
>>>> + 장문, txt 파일 입력
>>>>> - 파일 유효성 검사
>>>>> - 단어별로 자동 분리 및 파파고 API 적용
>>>>> - 빈도에 따른 자동 정렬
>> 4. 단어장(예정)
>>> * 권한 확인
>>> * 단어 추가, 수정, 삭제(비동기)
>>> * 단어 정렬(빈도, 알파벳, 중요 단어 등/ 비동기)
>>> * 단어장 삭제
>>>> - 실수 방지 문자 입력
>>> * 반응형 웹?(미정)
>> 5. 공지사항(예정)
>>> * 권한 확인 및 가능 행동 구분
>>> * 게시판 페이징
>>> * 글 제목 검색
>>> * 글쓰기
>>>> - summernote 적용


> 테이블
>> 1. MEMBER
>>> - ID: PRIMARY KEY, generated value
>>> - MEMBER_ID: VARCHAR2(15 CHAR), UNIQUE, NOT NULL
>>> - PASSWORD: VARCHAR2, NOT NULL
>>> - EMAIL: VARCHAR2, UNIQUE, NOT NULL
>>> - PHONE: VARCHAR2, UNIQUE, NOT NULL
>>> - ADDRESS: VARCHAR2
>>> - REG_DATE: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP
>>> - CERTIFIED: NUMBER(1,0), DEFAULT 0, NOT NULL
>> 2. WORDBOOK(예정)
>> 3. NOTICE(예정)

# 도서 대여관리 사이트
![BOOKTRIX 메인페이지](https://github.com/user-attachments/assets/cf758a3c-68ce-4fc8-9c50-a93e5d38f709)

----------------------------------------------------
# 도서, 회원, 대여를 쉽게 관리할수 있는 기능 제공

# 1. 기술스택
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![html5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)<br>
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)

# 2. 프로젝트 구조
[프로젝트.PDF](https://drive.google.com/file/d/1TJiXMqMjiDiM2O7P7YARYeI8jkwPc_XS/view?usp=sharing)

# 3. 프로젝트 후기
이번 프로젝트는 처음으로 백엔드 전반을 단독으로 구현해보는 도전적인 경험이었으며, 실질적인 개발 역량을 키우는 데 큰 도움이 되었습니다. 프로젝트 초기에 전체 데이터 흐름과 기능 목록을 분석한 후, 도서관리, 회원관리, 대여관리 각 기능에 필요한 DB 테이블을 직접 설계하고, Java와 JDBC를 이용해 CRUD 및 검색 기능을 구현했습니다. 단순히 동작하는 코드를 만드는 것이 아니라, 입력 유효성 검증, 예외 처리, 조건별 검색 로직 설계 등 실제 서비스에 가까운 기능을 구현하면서 문제 해결 능력을 키울 수 있었습니다.
특히 검색 기능의 경우, 도서코드, 제목, 저자 등 다양한 조건에 따라 유연하게 검색이 가능하도록 쿼리 구조를 설계하였고, 대여 관리 기능에서는 외래키 관계를 고려한 조회 기능을 구현하며 데이터 간 연계성에 대한 이해도도 높일 수 있었습니다. 또한, 백엔드 전체 로직을 직접 구상하면서 JDBC 연결, SQL 쿼리 조작, 예외 상황 처리 등 핵심 기술 요소들을 깊이 있게 다룰 수 있는 기회가 되었습니다.
기술 외적으로는, 팀원 중 한 분이 프로젝트에 거의 참여하지 못한 상황에서 부담이 컸지만, 그만큼 책임감을 갖고 계획을 세워 하나씩 해결해나가며 주도적으로 프로젝트를 완수할 수 있었습니다. 협업과 분담이 중요한 개발 환경에서 이러한 경험은 실제 개발 현장에서의 유연한 대응력과 커뮤니케이션의 중요성을 느끼게 해주었습니다.
향후에는 기능 단위 테스트를 더 철저히 하고, 대여관리 기능에도 수정 및 삭제 기능을 추가하여 더 완성도 높은 프로그램을 만드는 것이 목표입니다. 또한 팀 프로젝트에서 발생할 수 있는 변수에 유연하게 대응하기 위해 형상 관리(Git)의 적극적인 활용과 작업 분배 기준의 명확화를 앞으로의 과제로 삼을 생각입니다.


# 4. 주요기능 
### 도서관리
|기능명|상세|
|--|--|
|도서등록|제목, 도서코드, 저자, 장르, 가격, 제작사 등을 입력후 새책을 등록할수 있습니다.|
|도서 수정| 등록된 도서를 수정 가능하며 제목, 저자, 장르, 가격사, 제작사를 수정가능합니다.|
|도서 삭제|등록되어 있는 도서를 삭제할 수 있으며, 삭제시엔 모든 사람에게 보이지 않습니다.|
|도서 검색(조회)|도서는 제목, 도서코드, 저자로 검색(조회) 가능합니다.|

### 회원관리
|기능명|상세|
|--|--|
|회원 등록|아이디, 비밀번호, 이름, 나이, 주소, 성별등을 입력하고 회원 등록을 할 수 있습니다.|
|회원 수정|고객번호는 따로 수정할수 없으며 아이디, 이름, 나이, 주소, 성별 등은 수정 가능합니다.|
|회원 삭제|등록되어 있는 회원을 탈퇴 가능하며, 탈퇴시엔 모든 사람에게 보여지지 않습니다.|
|회원 검색(조회)|회원 전체 조회, 회원 이름으로 조회, 회원 아이디로 조회 등으로 검색(조회) 가능합니다.|

### 대여관리
|기능명|상세|
|--|--|
|대여 등록|대여번호, 책번호, 고객아이디 등을 입력하여 대여 정보를 등록 할 수 있습니다.|
|대여 검색(조회)|대여 관리 전체 조회,  회원 아이디로 대여 조회, 책번호로 대여 조회 등으로 검색(조회) 가능합니다.|

# 5.화면 구현
### 로그인페이지
![BOOKTRIX 로그인페이지](https://github.com/user-attachments/assets/d9d6c172-6cb2-4dc6-8cd0-7686725aaa09)
- 로그인 페이지로서 로그인하여 메인페이지로 이동할 수 있습니다.
  
### 메인페이지
![BOOKTRIX 메인페이지](https://github.com/user-attachments/assets/9166423f-4db2-4497-b9f1-6e8d0c3410ac)
- 도서대여 서비스 프로그램에 메인페이지로서 도서관리, 회원관리, 대여관리 페이지로 이동 가능합니다.

### 도서관리 목록페이지
![BOOKTRIX 도서관리 목록페이지](https://github.com/user-attachments/assets/9a63066b-d227-4aac-897c-b6147222dec8)
- 도서관리에 목록페이지로서 등록된 도서정보(도서코드, 타이틀, 저자, 장르, 가격, 제작사)를 확인 할 수 있습니다.

### 도서관리 등록페이지
![BOOKTRIX 도서관리 등록페이지](https://github.com/user-attachments/assets/885ef8b3-77c5-419e-af28-9d5f17794c0e)
- 도서를 등록할 수 있는 페이지로서 제목, 도서코드, 저자, 장르, 가격, 제작사 등을 입력하여 도서를 등록 할 수 있습니다.

### 도서관리 수정, 삭제페이지
![BOOKTRIX 도서관리 수정,삭제페이지](https://github.com/user-attachments/assets/1c84d911-a59c-4d1a-b44e-e5795a9b85b1)
- 도서 수정을 할 수 있는 페이지로서 제목, 저자, 장르, 가격, 제작사 등을 수정하거나 삭제할 수 있습니다.

### 도서관리 검색페이지
![BOOKTRIX 도서관리 검색페이지](https://github.com/user-attachments/assets/69d33452-6bf3-4f6c-aa49-f874c28f08f5)
- 도서관리 페이지 도서검색 페이지로 제목, 도서코드, 저자 등으로 검색할수 있습니다.

### 회원관리 목록페이지
![BOOKTRIX 회원관리 목록페이지](https://github.com/user-attachments/assets/d841c465-8a7e-4956-937a-a92a8c0c3566)
- 회원관리에 목록페이지로서 고객번호, 고객아이디, 이름, 나이, 주소, 성별, 가입일 등에 관한 정보를 알 수 있습니다.

### 회원관리 등록페이지
![BOOKTRIX 회원등록페이지](https://github.com/user-attachments/assets/494b3b61-a304-4a75-bc1d-513eefc3b9ff)
- 회원관리에 회원을 등록하는 페이지로서 아이디, 비밀번호, 이름, 나이, 주소, 성별을 입력한뒤 등록할 수 있습니다.

### 회원관리 수정, 삭제페이지
![BOOKTRIX 회원관리 수정삭제페이지](https://github.com/user-attachments/assets/e485eb46-a6ad-442c-8c48-8a7867f175cd)
- 등록된 회원에 정보를 수정할 수 있는 펭지로 아이디, 이름, 나이, 주소, 성별 등을 변경할수 있으며 회원 정보를 삭제할 수도 있습니다.

### 회원관리 검색페이지
![BOOKTRIX 회원검색페이지](https://github.com/user-attachments/assets/7dacd912-09a6-4c42-9704-02d6b672a85c)
- 회원관리 페이지에 회원검색시 회원 전체조회, 회원 이름으로 조회, 회원 아이디로 조회로 검색을 할 수 있습니다.

### 대여관리 목록페이지
![BOOKTRIX 대여관리 목록페이지](https://github.com/user-attachments/assets/9f391df1-4b22-4ba4-b71a-ec75a7aa188a)
- 대여관리 목록페이지로서 책을 대여한 회원에 대한 정보(대여일, 반납일, 고객아이디 등)을 파악 가능합니다.

### 대여관리 등록페이지
![BOOKTRIX 대여등록페이지](https://github.com/user-attachments/assets/5d419083-cb9d-466b-b519-e3f96f0c5726)
- 대여한 사람을 등록할 수 있는 페이지로서 대여번호, 책번호, 고객아이디등을 입력한뒤 등록하게 됩니다.

### 대여관리 검색페이지
![BOOKTRIX 대여관리 검색페이지](https://github.com/user-attachments/assets/a4c9bfea-6a45-4bc6-bdd2-3b3d94f5aad0)
- 대여관리 페이지에 대여검색시 대여 관리 전체조회, 회원아이디로 대여조회, 책번호로 대여조회로 검색을 할 수 있습니다.

# Java Study

---

## 📖 자바 따라잡기

안녕하세요! 👋  
저희는 **매주 2챕터씩 강의를 듣고, 자바 기초 문법을 마스터하기 위해 모인 스터디**입니다.  

이 스터디의 목표는 단순히 강의를 수동적으로 듣는 데 그치지 않고,  
- 각자 문제 풀이를 **직접 코드로 작성하고 공유**하며,  
- 서로의 코드를 **리뷰하고 피드백**하면서,  
- 자바의 기초를 단단히 다지는 것 💪  

을 목적으로 하고 있습니다.  

> 🌱 작은 습관이 모여 큰 실력이 됩니다.  
> 꾸준히 함께 하며 성장하는 것을 목표로 합니다! 🚀  

---

## ⚙️ 사용 방법

스터디는 GitHub 저장소를 통해 협업합니다.  
각 스터디원은 **자기 전용 브랜치**에서만 작업하며,  
문제별 패키지 안에 **자기 클래스(Main_xx)** 만 추가합니다.  

---

### 1. 최초 설정 (처음 참여 시 1회만)
```bash
git clone <repo-url>
cd <repo-folder>
git checkout -b <내이름>
git push -u origin <내이름>
```

- 저장소 클론 → Eclipse에 Import  
- 자기 전용 브랜치 생성 (`<내이름>` → 예: `chanhwi`)

---

### 2. pull (다른 사람 코드 받아오기)
```bash
git checkout main
git pull origin main
git checkout <내이름>
git merge main
```

- 항상 작업 시작 전 main을 갱신하고, 내 브랜치에 병합합니다.  
- 충돌이 나면 파일을 고치고 `git add → git commit` 으로 해결합니다.  

---

### 3. Eclipse에서 내 코드 추가하기
1. 문제 패키지(예: `boj_10162_Microwave`) **우클릭 → New > Class**  
2. Class Name: `Main_ch`  
3. `public static void main(String[] args)` 체크 후 Finish  
4. 코드 작성  

⚠️ 꼭 지켜야 하는 규칙  
- 코드 상단의 `package` 이름 = 실제 폴더 이름과 동일해야 함  
  ```java
  package boj_10162_Microwave;
  ```
- 클래스 이름 = 파일명과 동일해야 함  
  ```java
  public class Main_ch {   // 파일명이 Main_ch.java여야 함
      public static void main(String[] args) {
          // 코드 작성
      }
  }
  ```

---

### 4. push (내 코드 올리기)
```bash
git branch            # 현재 브랜치 확인 (* <내이름>)
git add src/boj_10162_Microwave/Main_ch.java
git commit -m "[boj-10162] 전자레인지 문제 풀이 추가"
git push
```

- **내 클래스만 add** → commit → push  

---

### 5. Pull Request(PR) 만들기
1. GitHub 웹 → **Compare & pull request**  
2. base: `main`, compare: `<내이름>` 확인  
3. 제목과 설명 작성 → **Create pull request**  
4. 리뷰 후 Merge되면 main에 반영  

---

### 6. 규칙
- main에서 직접 작업 ❌  
- 항상 **자기 전용 브랜치에서만 작업**  
- 문제별 패키지 안에는 **자기 클래스만 추가**  
- 커밋 메시지: `[boj-문제번호] 간단 요약`  
- 다른 사람 파일은 수정 금지  

---

👉 요약  
- **최초**: `git checkout -b <내이름>`  
- **작업 전**: `git checkout main` → `git pull` → `git checkout <내이름>` → `git merge main`  
- **작업 후**: Eclipse에서 클래스 생성(패키지·클래스 이름 일치 확인!) → `git add` → `git commit` → `git push` → PR 생성
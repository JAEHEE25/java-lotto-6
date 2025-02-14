# 💸 로또 개요
원하는 만큼 로또를 발행하여 당첨될 경우 금액을 받을 수 있는 프로그램입니다.

사용자가 입력한 로또 구입 금액만큼 로또가 발행됩니다.
해당 로또 번호와 사용자가 입력한 당첨 번호와 보너스 번호를 비교한 후, 결과에 따라 일정 금액을 받게 됩니다.

<br>

# 📋 기능 목록

로또를 구현하기 위한 기능 목록입니다.

## 1. 사용자 입력
- [x] 사용자는 로또 구입 금액을 입력할 수 있습니다.
- [x] 사용자는 당첨 번호를 입력할 수 있습니다.
  - [x] 숫자 범위는 1부터 45까지입니다.
  - [x] 당첨 번호는 중복되지 않는 숫자 6개입니다.
- [x] 사용자는 보너스 번호를 입력할 수 있습니다.
  - [x] 숫자 범위는 1부터 45까지입니다.
  - [x] 보너스 번호는 1개입니다.

<br>

## 2. 로또 발행
- [x] 구입 금액에 해당하는 만큼 로또를 발행합니다.
  - [x] 로또 1장의 가격은 1,000원입니다.
- [x] 1개의 로또를 발행할 때 중복되지 않는 숫자 6개를 랜덤으로 뽑습니다.
  - [x] 숫자 범위는 1부터 45까지입니다.

<br>

## 3. 당첨 여부 확인
- [x] 사용자가 구매한 로또 번호와 당첨 번호를 비교합니다.
  - [x] 몇 개의 숫자가 일치하는지 알 수 있습니다.
- [x] 당첨은 1등부터 5등까지 있으며, 당첨 기준과 금액은 아래와 같습니다.
  - 1등: 6개 번호 일치 / 2,000,000,000원
  - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
  - 3등: 5개 번호 일치 / 1,500,000원
  - 4등: 4개 번호 일치 / 50,000원
  - 5등: 3개 번호 일치 / 5,000원

<br>

## 4. 당첨 결과 확인
- [x] 당첨 내역 및 수익률을 출력합니다.

<br>

# ⚠️ 예외 상황

사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고 다시 입력을 받습니다.

- [x] 구입 금액에 숫자가 아닌 값이 포함 되어 있을 경우
- [x] 구입 금액이 1,000원 단위가 아닐 경우
- [x] 당첨 번호에 숫자가 아닌 값이 포함 되어 있을 경우
- [x] 당첨 번호가 1 ~ 45의 범위를 벗어날 경우
- [x] 당첨 번호가 6개가 아닐 경우
- [x] 당첨 번호가 중복될 경우
- [x] 보너스 번호에 숫자가 아닌 값이 포함 되어 있을 경우
- [x] 보너스 번호가 1 ~ 45의 범위를 벗어날 경우
- [x] 보너스 번호가 당첨 번호와 중복될 경우
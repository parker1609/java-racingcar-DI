# DI 패턴을 적용한 레이싱 자동차 게임
랜덤 값은 테스트하기 어렵다. 그렇다고 프로덕션 코드에서 사용하지 않는 테스트만을 위한 코드를 만드는 것은 좋지 않다. 이를 프로덕션 코드에서도 사용하고 테스트 코드에서 사용하는 유연한 코드를 만들기 위해 DI 패턴을 적용하였다.

- Tag를 보면 DI 패턴을 적용하기 전에는 테스트 코드에서 랜덤 값을 테스트할 수 없었지만, DI 패턴을 적용한 후에는 이를 해결한 모습을 볼 수 있다.

# yongdubot

## Entity
- **member** : 풋살 멤버 정보
- **ability** : 각 멤버의 능력치
- **match** : 경기 정보
- **ground** : 경기장 정보
- **uniform** : 유니폼 정보

## Relationship
- **member** → **ability** > N : M > 멤버는 여러 개의 능력치를 가질 수 있고 능력치는 여러 멤버에 귀속될 수 있다.
- **member** ↔ **match** > N : M > 멤버는 여러 경기에 참여할 수 있고 경기에 여러 멤버가 참여할 수 있다.
- **member** ↔ **uniform** > N : M > 멤버는 여러 유니폼을 보유할 수 있고 유니폼은 여러 멤버에 귀속될 수 있다.
- **match** ↔ **ground** > 1 : N > 경기는 한 경기장에서 진행되며 경기장에서는 여러 경기가 진행된다.

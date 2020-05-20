# 重构「镶金玫瑰商店」

![Build](https://github.com/xpbootcamp/refactoring-gilded-rose-basic/workflows/Build/badge.svg)

## 做了如下调整

修改命名风格:  from sell_in to sellIn
使用常量来替换字符串: final String BackStageName = "Backstage passes to a TAFKAL80ETC concert";
去掉多层 if 嵌套： update_quality
成员变量私有化： private int sellIn
改善封装，通过公共函数来控制内部数据： public void qualityIncrease()
更新了readme 
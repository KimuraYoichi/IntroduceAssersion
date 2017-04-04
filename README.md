# IntroduceAssersion
## Refactoring methods "IntroduceAssersion"

その条件が実行時に満たされていると言うことを表明する。  
    assert value > 0;  
と書かれていたとき、実行時に条件を満たせば何もおこらない。  
満たさない場合には  
    java.lang.AssertionError   
と言う例外をthrowする。（致命的なエラー：catchするコードは書かない）  

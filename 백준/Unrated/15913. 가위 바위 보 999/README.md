# [Unrated] 가위 바위 보 999 - 15913 

[문제 링크](https://www.acmicpc.net/problem/15913) 

### 성능 요약

메모리: 14264 KB, 시간: 100 ms

### 분류

분류 없음

### 제출 일자

2025년 1월 4일 22:01:38

### 문제 설명

<p>채점 프로그램과 가위 바위 보를 999번 해서, 최대한 많이 이겨 보자.</p>

<p>채점 프로그램은 랜덤을 이용해 가위 바위 보 중 하나를 결정하며, 그 코드를 간단히 나타내면 다음과 같다. 아래 코드의 변수 <code>judge</code>가 채점 프로그램이 결정한 값이다.</p>

<div><div id="highlighter_734076" class="syntaxhighlighter  c"><table border="0" cellpadding="0" cellspacing="0"><tbody><tr><td class="gutter"><div class="line number1 index0 alt2">1</div><div class="line number2 index1 alt1">2</div><div class="line number3 index2 alt2">3</div><div class="line number4 index3 alt1">4</div><div class="line number5 index4 alt2">5</div><div class="line number6 index5 alt1">6</div><div class="line number7 index6 alt2">7</div><div class="line number8 index7 alt1">8</div><div class="line number9 index8 alt2">9</div></td><td class="code"><div class="container"><div class="line number1 index0 alt2"><code class="c preprocessor">#include <random></code></div><div class="line number2 index1 alt1"><code class="c keyword bold">using</code> <code class="c keyword bold">namespace</code> <code class="c plain">std;</code></div><div class="line number3 index2 alt2"><code class="c color1 bold">int</code> <code class="c plain">main() {</code></div><div class="line number4 index3 alt1"><code class="c spaces">    </code><code class="c plain">random_device rd;</code></div><div class="line number5 index4 alt2"><code class="c spaces">    </code><code class="c plain">mt19937 gen(rd());</code></div><div class="line number6 index5 alt1"><code class="c spaces">    </code><code class="c plain">uniform_int_distribution<</code><code class="c color1 bold">int</code><code class="c plain">> distribution(0, 2);</code></div><div class="line number7 index6 alt2"><code class="c spaces">    </code><code class="c color1 bold">int</code> <code class="c plain">judge = distribution(gen);</code></div><div class="line number8 index7 alt1"><code class="c spaces">    </code><code class="c keyword bold">return</code> <code class="c plain">0;</code></div><div class="line number9 index8 alt2"><code class="c plain">}</code></div></div></td></tr></tbody></table></div></div>

### 입력 

 <p>이 문제는 입력이 없다.</p>

### 출력 

 <p>첫째 줄에 무엇을 낼 것인지 출력한다.</p>

<p>가위는 0, 바위는 1, 보는 2이다.</p>


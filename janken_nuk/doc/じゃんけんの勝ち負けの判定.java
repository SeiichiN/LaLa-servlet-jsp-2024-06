
if (user == com) {
  msg = "引き分け";
} else if ( (user == 0 && com == 1) ||
            (user == 1 && com == 2) ||
            (user == 2 && com == 0) ) {
  msg = "あなたの勝ち";            
} else {
  msg = "わたしの勝ち";
}


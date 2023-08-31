public class Card {
 
// Private instance variables (PIVs): 
private String suit;
private String rank;
 
// Constructors:
public Card() {
suit = "Spades";
rank = "Ace";
}
// Overloading:
public Card(String x, String y) {
suit = x;
rank = y;
}
 
// Accessors (getters):
public String getsuit() {
return suit;
}
public String getrank() {
return rank;
}
 
// Mutators (Setters):
public void setSuit(String str) {
suit = str;
}
public void setRank(String str) {
rank = str;
}
 
// toString Method:
public String toString() {
return "The suit is " + suit + " and the rank is " + rank + ".";
}
 
}
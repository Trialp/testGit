package getalp.wsd.ufsac.utils;

import java.util.HashSet;
import java.util.Set;

public final class StopList 
{
    private static final Set<String> stopWords = new HashSet<>();
    
    private static boolean loaded = false;
    
    private static void loadStopWords()
    {
        stopWords.add("a");
        stopWords.add("able");
        stopWords.add("about");
        stopWords.add("above");
        stopWords.add("abroad");
        stopWords.add("abst");
        stopWords.add("accordance");
        stopWords.add("according");
        stopWords.add("accordingly");
        stopWords.add("across");
        stopWords.add("act");
        stopWords.add("actually");
        stopWords.add("added");
        stopWords.add("adj");
        stopWords.add("adopted");
        stopWords.add("affected");
        stopWords.add("affecting");
        stopWords.add("affects");
        stopWords.add("after");
        stopWords.add("afterwards");
        stopWords.add("again");
        stopWords.add("against");
        stopWords.add("ago");
        stopWords.add("ah");
        stopWords.add("ahead");
        stopWords.add("ain't");
        stopWords.add("all");
        stopWords.add("allow");
        stopWords.add("allows");
        stopWords.add("almost");
        stopWords.add("alone");
        stopWords.add("along");
        stopWords.add("alongside");
        stopWords.add("already");
        stopWords.add("also");
        stopWords.add("although");
        stopWords.add("always");
        stopWords.add("am");
        stopWords.add("amid");
        stopWords.add("amidst");
        stopWords.add("among");
        stopWords.add("amongst");
        stopWords.add("amoungst");
        stopWords.add("amount");
        stopWords.add("an");
        stopWords.add("and");
        stopWords.add("announce");
        stopWords.add("another");
        stopWords.add("any");
        stopWords.add("anybody");
        stopWords.add("anyhow");
        stopWords.add("anymore");
        stopWords.add("anyone");
        stopWords.add("anything");
        stopWords.add("anyway");
        stopWords.add("anyways");
        stopWords.add("anywhere");
        stopWords.add("apart");
        stopWords.add("apparently");
        stopWords.add("appear");
        stopWords.add("appreciate");
        stopWords.add("appropriate");
        stopWords.add("approximately");
        stopWords.add("are");
        stopWords.add("aren");
        stopWords.add("aren't");
        stopWords.add("arent");
        stopWords.add("arise");
        stopWords.add("around");
        stopWords.add("first's");
        stopWords.add("as");
        stopWords.add("aside");
        stopWords.add("ask");
        stopWords.add("asking");
        stopWords.add("associated");
        stopWords.add("at");
        stopWords.add("auth");
        stopWords.add("available");
        stopWords.add("away");
        stopWords.add("awfully");
        stopWords.add("second");
        stopWords.add("back");
        stopWords.add("backward");
        stopWords.add("backwards");
        stopWords.add("be");
        stopWords.add("became");
        stopWords.add("because");
        stopWords.add("become");
        stopWords.add("becomes");
        stopWords.add("becoming");
        stopWords.add("been");
        stopWords.add("before");
        stopWords.add("beforehand");
        stopWords.add("begin");
        stopWords.add("beginning");
        stopWords.add("beginnings");
        stopWords.add("begins");
        stopWords.add("behind");
        stopWords.add("being");
        stopWords.add("believe");
        stopWords.add("below");
        stopWords.add("beside");
        stopWords.add("besides");
        stopWords.add("best");
        stopWords.add("better");
        stopWords.add("between");
        stopWords.add("beyond");
        stopWords.add("bill");
        stopWords.add("biol");
        stopWords.add("both");
        stopWords.add("bottom");
        stopWords.add("brief");
        stopWords.add("briefly");
        stopWords.add("but");
        stopWords.add("by");
        stopWords.add("c");
        stopWords.add("ca");
        stopWords.add("call");
        stopWords.add("came");
        stopWords.add("can");
        stopWords.add("cannot");
        stopWords.add("can't");
        stopWords.add("cant");
        stopWords.add("caption");
        stopWords.add("cause");
        stopWords.add("causes");
        stopWords.add("certain");
        stopWords.add("certainly");
        stopWords.add("changes");
        stopWords.add("clearly");
        stopWords.add("c'mon");
        stopWords.add("co.");
        stopWords.add("co");
        stopWords.add("com");
        stopWords.add("come");
        stopWords.add("comes");
        stopWords.add("computer");
        stopWords.add("con");
        stopWords.add("concerning");
        stopWords.add("consequently");
        stopWords.add("consider");
        stopWords.add("considering");
        stopWords.add("contain");
        stopWords.add("containing");
        stopWords.add("contains");
        stopWords.add("corresponding");
        stopWords.add("could");
        stopWords.add("couldn't");
        stopWords.add("couldnt");
        stopWords.add("course");
        stopWords.add("cry");
        stopWords.add("c's");
        stopWords.add("currently");
        stopWords.add("d");
        stopWords.add("dare");
        stopWords.add("daren't");
        stopWords.add("date");
        stopWords.add("de");
        stopWords.add("definitely");
        stopWords.add("describe");
        stopWords.add("described");
        stopWords.add("despite");
        stopWords.add("detail");
        stopWords.add("did");
        stopWords.add("didn't");
        stopWords.add("different");
        stopWords.add("directly");
        stopWords.add("do");
        stopWords.add("does");
        stopWords.add("doesn't");
        stopWords.add("doing");
        stopWords.add("done");
        stopWords.add("don't");
        stopWords.add("down");
        stopWords.add("downwards");
        stopWords.add("due");
        stopWords.add("during");
        stopWords.add("e");
        stopWords.add("each");
        stopWords.add("ed");
        stopWords.add("edu");
        stopWords.add("effect");
        stopWords.add("eg");
        stopWords.add("eight");
        stopWords.add("eighty");
        stopWords.add("either");
        stopWords.add("eleven");
        stopWords.add("else");
        stopWords.add("elsewhere");
        stopWords.add("empty");
        stopWords.add("end");
        stopWords.add("ending");
        stopWords.add("enough");
        stopWords.add("entirely");
        stopWords.add("especially");
        stopWords.add("et");
        stopWords.add("et-al");
        stopWords.add("etc");
        stopWords.add("even");
        stopWords.add("ever");
        stopWords.add("evermore");
        stopWords.add("every");
        stopWords.add("everybody");
        stopWords.add("everyone");
        stopWords.add("everything");
        stopWords.add("everywhere");
        stopWords.add("ex");
        stopWords.add("exactly");
        stopWords.add("example");
        stopWords.add("except");
        stopWords.add("f");
        stopWords.add("fairly");
        stopWords.add("far");
        stopWords.add("farther");
        stopWords.add("few");
        stopWords.add("fewer");
        stopWords.add("ff");
        stopWords.add("fifteen");
        stopWords.add("fifth");
        stopWords.add("fify");
        stopWords.add("fill");
        stopWords.add("find");
        stopWords.add("fire");
        stopWords.add("first");
        stopWords.add("five");
        stopWords.add("fix");
        stopWords.add("followed");
        stopWords.add("following");
        stopWords.add("follows");
        stopWords.add("for");
        stopWords.add("forever");
        stopWords.add("former");
        stopWords.add("formerly");
        stopWords.add("forth");
        stopWords.add("forty");
        stopWords.add("forward");
        stopWords.add("found");
        stopWords.add("four");
        stopWords.add("from");
        stopWords.add("front");
        stopWords.add("full");
        stopWords.add("further");
        stopWords.add("furthermore");
        stopWords.add("g");
        stopWords.add("gave");
        stopWords.add("get");
        stopWords.add("gets");
        stopWords.add("getting");
        stopWords.add("give");
        stopWords.add("given");
        stopWords.add("gives");
        stopWords.add("giving");
        stopWords.add("go");
        stopWords.add("goes");
        stopWords.add("going");
        stopWords.add("gone");
        stopWords.add("got");
        stopWords.add("gotten");
        stopWords.add("greetings");
        stopWords.add("h");
        stopWords.add("had");
        stopWords.add("hadn't");
        stopWords.add("half");
        stopWords.add("happens");
        stopWords.add("hardly");
        stopWords.add("has");
        stopWords.add("hasn't");
        stopWords.add("hasnt");
        stopWords.add("have");
        stopWords.add("haven't");
        stopWords.add("having");
        stopWords.add("he");
        stopWords.add("he'd");
        stopWords.add("hed");
        stopWords.add("he'll");
        stopWords.add("hello");
        stopWords.add("help");
        stopWords.add("hence");
        stopWords.add("her");
        stopWords.add("here");
        stopWords.add("hereafter");
        stopWords.add("hereby");
        stopWords.add("herein");
        stopWords.add("here's");
        stopWords.add("heres");
        stopWords.add("hereupon");
        stopWords.add("hers");
        stopWords.add("herse”");
        stopWords.add("herself");
        stopWords.add("he's");
        stopWords.add("hes");
        stopWords.add("hi");
        stopWords.add("hid");
        stopWords.add("him");
        stopWords.add("himse”");
        stopWords.add("himself");
        stopWords.add("his");
        stopWords.add("hither");
        stopWords.add("home");
        stopWords.add("hopefully");
        stopWords.add("how");
        stopWords.add("howbeit");
        stopWords.add("however");
        stopWords.add("how's");
        stopWords.add("hundred");
        stopWords.add("i");
        stopWords.add("i'd");
        stopWords.add("id");
        stopWords.add("ie");
        stopWords.add("if");
        stopWords.add("ignored");
        stopWords.add("i'll");
        stopWords.add("i'm");
        stopWords.add("im");
        stopWords.add("immediate");
        stopWords.add("immediately");
        stopWords.add("importance");
        stopWords.add("important");
        stopWords.add("in");
        stopWords.add("inasmuch");
        stopWords.add("inc.");
        stopWords.add("inc");
        stopWords.add("indeed");
        stopWords.add("index");
        stopWords.add("indicate");
        stopWords.add("indicated");
        stopWords.add("indicates");
        stopWords.add("information");
        stopWords.add("inner");
        stopWords.add("inside");
        stopWords.add("insofar");
        stopWords.add("instead");
        stopWords.add("interest");
        stopWords.add("into");
        stopWords.add("invention");
        stopWords.add("inward");
        stopWords.add("is");
        stopWords.add("isn't");
        stopWords.add("it");
        stopWords.add("it'd");
        stopWords.add("itd");
        stopWords.add("it'll");
        stopWords.add("it's");
        stopWords.add("its");
        stopWords.add("itse”");
        stopWords.add("itself");
        stopWords.add("i've");
        stopWords.add("j");
        stopWords.add("just");
        stopWords.add("k");
        stopWords.add("keep");
        stopWords.add("keeps");
        stopWords.add("kept");
        stopWords.add("keys");
        stopWords.add("kg");
        stopWords.add("km");
        stopWords.add("know");
        stopWords.add("known");
        stopWords.add("knows");
        stopWords.add("l");
        stopWords.add("largely");
        stopWords.add("last");
        stopWords.add("lately");
        stopWords.add("later");
        stopWords.add("latter");
        stopWords.add("latterly");
        stopWords.add("least");
        stopWords.add("less");
        stopWords.add("lest");
        stopWords.add("let");
        stopWords.add("let's");
        stopWords.add("lets");
        stopWords.add("like");
        stopWords.add("liked");
        stopWords.add("likely");
        stopWords.add("likewise");
        stopWords.add("line");
        stopWords.add("little");
        stopWords.add("'ll");
        stopWords.add("look");
        stopWords.add("looking");
        stopWords.add("looks");
        stopWords.add("low");
        stopWords.add("lower");
        stopWords.add("ltd");
        stopWords.add("m");
        stopWords.add("made");
        stopWords.add("mainly");
        stopWords.add("make");
        stopWords.add("makes");
        stopWords.add("many");
        stopWords.add("may");
        stopWords.add("maybe");
        stopWords.add("mayn't");
        stopWords.add("me");
        stopWords.add("mean");
        stopWords.add("means");
        stopWords.add("meantime");
        stopWords.add("meanwhile");
        stopWords.add("merely");
        stopWords.add("mg");
        stopWords.add("might");
        stopWords.add("mightn't");
        stopWords.add("mill");
        stopWords.add("million");
        stopWords.add("mine");
        stopWords.add("minus");
        stopWords.add("miss");
        stopWords.add("ml");
        stopWords.add("more");
        stopWords.add("moreover");
        stopWords.add("most");
        stopWords.add("mostly");
        stopWords.add("move");
        stopWords.add("mr");
        stopWords.add("mrs");
        stopWords.add("much");
        stopWords.add("mug");
        stopWords.add("must");
        stopWords.add("mustn't");
        stopWords.add("my");
        stopWords.add("myse”");
        stopWords.add("myself");
        stopWords.add("n");
        stopWords.add("na");
        stopWords.add("name");
        stopWords.add("namely");
        stopWords.add("nay");
        stopWords.add("nd");
        stopWords.add("near");
        stopWords.add("nearly");
        stopWords.add("necessarily");
        stopWords.add("necessary");
        stopWords.add("need");
        stopWords.add("needn't");
        stopWords.add("needs");
        stopWords.add("neither");
        stopWords.add("never");
        stopWords.add("neverf");
        stopWords.add("neverless");
        stopWords.add("nevertheless");
        stopWords.add("new");
        stopWords.add("next");
        stopWords.add("nine");
        stopWords.add("ninety");
        stopWords.add("no");
        stopWords.add("nobody");
        stopWords.add("non");
        stopWords.add("none");
        stopWords.add("nonetheless");
        stopWords.add("no-one");
        stopWords.add("noone");
        stopWords.add("nor");
        stopWords.add("normally");
        stopWords.add("nos");
        stopWords.add("not");
        stopWords.add("noted");
        stopWords.add("nothing");
        stopWords.add("notwithstanding");
        stopWords.add("novel");
        stopWords.add("now");
        stopWords.add("nowhere");
        stopWords.add("nt");
        stopWords.add("o");
        stopWords.add("obtain");
        stopWords.add("obtained");
        stopWords.add("obviously");
        stopWords.add("of");
        stopWords.add("off");
        stopWords.add("often");
        stopWords.add("oh");
        stopWords.add("ok");
        stopWords.add("okay");
        stopWords.add("old");
        stopWords.add("omitted");
        stopWords.add("on");
        stopWords.add("once");
        stopWords.add("one");
        stopWords.add("one's");
        stopWords.add("ones");
        stopWords.add("only");
        stopWords.add("onto");
        stopWords.add("opposite");
        stopWords.add("or");
        stopWords.add("ord");
        stopWords.add("other");
        stopWords.add("others");
        stopWords.add("otherwise");
        stopWords.add("ought");
        stopWords.add("oughtn't");
        stopWords.add("our");
        stopWords.add("ours ");
        stopWords.add("ours");
        stopWords.add("ourselves");
        stopWords.add("out");
        stopWords.add("outside");
        stopWords.add("over");
        stopWords.add("overall");
        stopWords.add("owing");
        stopWords.add("own");
        stopWords.add("p");
        stopWords.add("page");
        stopWords.add("pages");
        stopWords.add("part");
        stopWords.add("particular");
        stopWords.add("particularly");
        stopWords.add("past");
        stopWords.add("per");
        stopWords.add("perhaps");
        stopWords.add("placed");
        stopWords.add("please");
        stopWords.add("plus");
        stopWords.add("poorly");
        stopWords.add("possible");
        stopWords.add("possibly");
        stopWords.add("potentially");
        stopWords.add("pp");
        stopWords.add("predominantly");
        stopWords.add("present");
        stopWords.add("presumably");
        stopWords.add("previously");
        stopWords.add("primarily");
        stopWords.add("probably");
        stopWords.add("promptly");
        stopWords.add("proud");
        stopWords.add("provided");
        stopWords.add("provides");
        stopWords.add("put");
        stopWords.add("q");
        stopWords.add("que");
        stopWords.add("quickly");
        stopWords.add("quite");
        stopWords.add("qv");
        stopWords.add("r");
        stopWords.add("ran");
        stopWords.add("rather");
        stopWords.add("rd");
        stopWords.add("re");
        stopWords.add("readily");
        stopWords.add("really");
        stopWords.add("reasonably");
        stopWords.add("recent");
        stopWords.add("recently");
        stopWords.add("ref");
        stopWords.add("refs");
        stopWords.add("regarding");
        stopWords.add("regardless");
        stopWords.add("regards");
        stopWords.add("related");
        stopWords.add("relatively");
        stopWords.add("research");
        stopWords.add("respectively");
        stopWords.add("resulted");
        stopWords.add("resulting");
        stopWords.add("results");
        stopWords.add("right");
        stopWords.add("round");
        stopWords.add("run");
        stopWords.add("s");
        stopWords.add("said");
        stopWords.add("same");
        stopWords.add("saw");
        stopWords.add("say");
        stopWords.add("saying");
        stopWords.add("says");
        stopWords.add("sec");
        stopWords.add("second");
        stopWords.add("secondly");
        stopWords.add("section");
        stopWords.add("see");
        stopWords.add("seeing");
        stopWords.add("seem");
        stopWords.add("seemed");
        stopWords.add("seeming");
        stopWords.add("seems");
        stopWords.add("seen");
        stopWords.add("self");
        stopWords.add("selves");
        stopWords.add("sensible");
        stopWords.add("sent");
        stopWords.add("serious");
        stopWords.add("seriously");
        stopWords.add("seven");
        stopWords.add("several");
        stopWords.add("shall");
        stopWords.add("shan't");
        stopWords.add("she");
        stopWords.add("she'd");
        stopWords.add("shed");
        stopWords.add("she'll");
        stopWords.add("she's");
        stopWords.add("shes");
        stopWords.add("should");
        stopWords.add("shouldn't");
        stopWords.add("show");
        stopWords.add("showed");
        stopWords.add("shown");
        stopWords.add("showns");
        stopWords.add("shows");
        stopWords.add("side");
        stopWords.add("significant");
        stopWords.add("significantly");
        stopWords.add("similar");
        stopWords.add("similarly");
        stopWords.add("since");
        stopWords.add("sincere");
        stopWords.add("six");
        stopWords.add("sixty");
        stopWords.add("slightly");
        stopWords.add("so");
        stopWords.add("some");
        stopWords.add("somebody");
        stopWords.add("someday");
        stopWords.add("somehow");
        stopWords.add("someone");
        stopWords.add("somethan");
        stopWords.add("something");
        stopWords.add("sometime");
        stopWords.add("sometimes");
        stopWords.add("somewhat");
        stopWords.add("somewhere");
        stopWords.add("soon");
        stopWords.add("sorry");
        stopWords.add("specifically");
        stopWords.add("specified");
        stopWords.add("specify");
        stopWords.add("specifying");
        stopWords.add("state");
        stopWords.add("states");
        stopWords.add("still");
        stopWords.add("stop");
        stopWords.add("strongly");
        stopWords.add("sub");
        stopWords.add("substantially");
        stopWords.add("successfully");
        stopWords.add("such");
        stopWords.add("sufficiently");
        stopWords.add("suggest");
        stopWords.add("sup");
        stopWords.add("sure");
        stopWords.add("system");
        stopWords.add("t");
        stopWords.add("take");
        stopWords.add("taken");
        stopWords.add("taking");
        stopWords.add("tell");
        stopWords.add("ten");
        stopWords.add("tends");
        stopWords.add("th");
        stopWords.add("than");
        stopWords.add("thank");
        stopWords.add("thanks");
        stopWords.add("thanx");
        stopWords.add("that");
        stopWords.add("that'll");
        stopWords.add("that's");
        stopWords.add("thats");
        stopWords.add("that've");
        stopWords.add("the");
        stopWords.add("their");
        stopWords.add("theirs");
        stopWords.add("them");
        stopWords.add("themselves");
        stopWords.add("then");
        stopWords.add("thence");
        stopWords.add("there");
        stopWords.add("thereafter");
        stopWords.add("thereby");
        stopWords.add("there'd");
        stopWords.add("thered");
        stopWords.add("therefore");
        stopWords.add("therein");
        stopWords.add("there'll");
        stopWords.add("thereof");
        stopWords.add("there're");
        stopWords.add("therere");
        stopWords.add("there's");
        stopWords.add("theres");
        stopWords.add("thereto");
        stopWords.add("thereupon");
        stopWords.add("there've");
        stopWords.add("these");
        stopWords.add("they");
        stopWords.add("they'd");
        stopWords.add("theyd");
        stopWords.add("they'll");
        stopWords.add("they're");
        stopWords.add("theyre");
        stopWords.add("they've");
        stopWords.add("thick");
        stopWords.add("thin");
        stopWords.add("thing");
        stopWords.add("things");
        stopWords.add("think");
        stopWords.add("third");
        stopWords.add("thirty");
        stopWords.add("this");
        stopWords.add("thorough");
        stopWords.add("thoroughly");
        stopWords.add("those");
        stopWords.add("thou");
        stopWords.add("though");
        stopWords.add("thoughh");
        stopWords.add("thousand");
        stopWords.add("three");
        stopWords.add("throug");
        stopWords.add("through");
        stopWords.add("throughout");
        stopWords.add("thru");
        stopWords.add("thus");
        stopWords.add("til");
        stopWords.add("till");
        stopWords.add("tip");
        stopWords.add("to");
        stopWords.add("together");
        stopWords.add("too");
        stopWords.add("took");
        stopWords.add("top");
        stopWords.add("toward");
        stopWords.add("towards");
        stopWords.add("tried");
        stopWords.add("tries");
        stopWords.add("truly");
        stopWords.add("try");
        stopWords.add("trying");
        stopWords.add("t's");
        stopWords.add("ts");
        stopWords.add("twelve");
        stopWords.add("twenty");
        stopWords.add("twice");
        stopWords.add("two");
        stopWords.add("u");
        stopWords.add("un");
        stopWords.add("under");
        stopWords.add("underneath");
        stopWords.add("undoing");
        stopWords.add("unfortunately");
        stopWords.add("unless");
        stopWords.add("unlike");
        stopWords.add("unlikely");
        stopWords.add("until");
        stopWords.add("unto");
        stopWords.add("up");
        stopWords.add("upon");
        stopWords.add("ups");
        stopWords.add("upwards");
        stopWords.add("us");
        stopWords.add("use");
        stopWords.add("used");
        stopWords.add("useful");
        stopWords.add("usefully");
        stopWords.add("usefulness");
        stopWords.add("uses");
        stopWords.add("using");
        stopWords.add("usually");
        stopWords.add("uucp");
        stopWords.add("v");
        stopWords.add("value");
        stopWords.add("various");
        stopWords.add("'ve");
        stopWords.add("versus");
        stopWords.add("very");
        stopWords.add("via");
        stopWords.add("viz");
        stopWords.add("vol");
        stopWords.add("vols");
        stopWords.add("vs");
        stopWords.add("w");
        stopWords.add("want");
        stopWords.add("wants");
        stopWords.add("was");
        stopWords.add("wasn't");
        stopWords.add("way");
        stopWords.add("we");
        stopWords.add("we'd");
        stopWords.add("wed");
        stopWords.add("welcome");
        stopWords.add("we'll");
        stopWords.add("well");
        stopWords.add("went");
        stopWords.add("we're");
        stopWords.add("were");
        stopWords.add("weren't");
        stopWords.add("we've");
        stopWords.add("what");
        stopWords.add("whatever");
        stopWords.add("what'll");
        stopWords.add("what's");
        stopWords.add("whats");
        stopWords.add("what've");
        stopWords.add("when");
        stopWords.add("whence");
        stopWords.add("whenever");
        stopWords.add("when's");
        stopWords.add("where");
        stopWords.add("whereafter");
        stopWords.add("whereas");
        stopWords.add("whereby");
        stopWords.add("wherein");
        stopWords.add("where's");
        stopWords.add("wheres");
        stopWords.add("whereupon");
        stopWords.add("wherever");
        stopWords.add("whether");
        stopWords.add("which");
        stopWords.add("whichever");
        stopWords.add("while");
        stopWords.add("whilst");
        stopWords.add("whim");
        stopWords.add("whither");
        stopWords.add("who");
        stopWords.add("who'd");
        stopWords.add("whod");
        stopWords.add("whoever");
        stopWords.add("whole");
        stopWords.add("who'll");
        stopWords.add("whom");
        stopWords.add("whomever");
        stopWords.add("who's");
        stopWords.add("whos");
        stopWords.add("whose");
        stopWords.add("why");
        stopWords.add("why's");
        stopWords.add("widely");
        stopWords.add("will");
        stopWords.add("willing");
        stopWords.add("wish");
        stopWords.add("with");
        stopWords.add("within");
        stopWords.add("without");
        stopWords.add("wonder");
        stopWords.add("won't");
        stopWords.add("words");
        stopWords.add("world");
        stopWords.add("would");
        stopWords.add("wouldn't");
        stopWords.add("www");
        stopWords.add("x");
        stopWords.add("y");
        stopWords.add("yes");
        stopWords.add("yet");
        stopWords.add("you");
        stopWords.add("you'd");
        stopWords.add("youd");
        stopWords.add("you'll");
        stopWords.add("your");
        stopWords.add("you're");
        stopWords.add("youre");
        stopWords.add("yours");
        stopWords.add("yourself");
        stopWords.add("yourselves");
        stopWords.add("you've");
        stopWords.add("z");
        stopWords.add("zero");
    }

    public static boolean isStopWord(String token) 
    {
        synchronized(stopWords)
        {
            if (!loaded) 
            {
                loadStopWords();
                loaded = true;
            }
        }
        return stopWords.contains(token);
    }

}
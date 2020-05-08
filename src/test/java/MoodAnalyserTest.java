import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Rule
   public ExpectedException thrown = ExpectedException.none();

    @Test
    public void moodAnalyseShouldReturnSAD() throws MoodException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("Im in a sad Mood");
        String mood = moodAnalyser.analyseMood();
        thrown.expect(MoodException.class);
        thrown.expectMessage("There is no mood");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void moodAnalyseShouldReturnHappy() throws MoodException {
        MoodAnalyser moodAnalyser=new MoodAnalyser("Im in a Happy Mood");
        String mood=moodAnalyser.analyseMood();
        thrown.expect(MoodException.class);
        thrown.expectMessage("There is no mood");
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullShouldReturnHappy() throws MoodException {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyseMood();
        thrown.expect(MoodException.class);
        thrown.expectMessage("There is no mood");
    }
}

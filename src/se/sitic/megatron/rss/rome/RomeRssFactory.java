package se.sitic.megatron.rss.rome;

import se.sitic.megatron.core.TypedProperties;
import se.sitic.megatron.rss.IRssChannel;
import se.sitic.megatron.rss.IRssFactory;
import se.sitic.megatron.rss.IRssItem;
import se.sitic.megatron.rss.IRssParser;
import se.sitic.megatron.rss.IRssWriter;


/**
 * Implements IRssFactory using Rome,
 * https://rome.dev.java.net/
 */
public class RomeRssFactory implements IRssFactory {
    private TypedProperties props;


    /**
     * Constructor.
     */
    public RomeRssFactory(TypedProperties props) {
        this.props = props;
    }


    @Override
    public IRssParser createRssParser() {
        return new RomeRssParser(props);
    }


    @Override
    public IRssChannel createRssChannel() {
        return new RomeRssChannel(props);
    }


    @Override
    public IRssItem createRssItem(IRssChannel parentChannel) {
        return new RomeRssItem(props, (RomeRssChannel)parentChannel);
    }


    @Override
    public IRssWriter createRssWriter() {
        return new RomeRssWriter(props);
    }

}

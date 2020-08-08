package pojo;

/**
 * @program: javaee
 * 描述：
 * @author: NB
 * @create: 2020-08-07 20:03
 **/
public class Topic {
    private int id;
    private String topicname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topic topic = (Topic) o;

        if (id != topic.id) return false;
        if (topicname != null ? !topicname.equals(topic.topicname) : topic.topicname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (topicname != null ? topicname.hashCode() : 0);
        return result;
    }
}

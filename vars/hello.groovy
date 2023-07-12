import jenkins.cicd.*

def call(){
    def test = new Test()

    stage(){
        println("hello world")
    }
}
import jenkins.cicd.*

def call(){
    def test = new test()

    //stage("test"){
    //    println("hello world")
    //}
    test.testCall()
}
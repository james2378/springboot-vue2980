const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaoqingongzuxue/",
            name: "gaoxiaoqingongzuxue",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaoqingongzuxue/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校勤工助学系统"
        } 
    }
}
export default base

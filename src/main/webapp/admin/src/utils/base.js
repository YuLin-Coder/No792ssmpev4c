const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmpev4c/",
            name: "ssmpev4c",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmpev4c/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "药房药品采购集中管理系统"
        } 
    }
}
export default base

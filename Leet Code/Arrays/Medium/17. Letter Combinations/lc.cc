class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if(digits==""){
            vector<string>emp;
            return emp;
        }
    vector<string> res;
    string charmap[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    res.push_back("");
    for (int i = 0; i < digits.size(); i++)
    {
        vector<string> tempres;
        string chars = charmap[digits[i] - '0'];
        cout<<chars<<endl;
        for (int c = 0; c < chars.size();c++)
            for (int j = 0; j < res.size();j++)
                tempres.push_back(res[j]+chars[c]);
       
        res = tempres;
         cout<<res.size()<<endl;
    }
    return res;
}
};

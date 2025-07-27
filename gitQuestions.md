# Git and GitHub Interview Questions

These questions cover core concepts, common workflows, and problem-solving scenarios. Be prepared to explain your answers clearly and provide examples where appropriate.

---

## I. Git Fundamentals

1. What is Git, and why is it important in software development?

2. What are the key benefits of using a Distributed Version Control System (DVCS) like Git compared to Centralized Version Control Systems (CVCS)?

3. Explain the difference between Git and GitHub.

4. Can you use Git without GitHub? If so, how?

5. Describe the three states of Git (Modified, Staged, Committed) and the three areas (Working Directory, Staging Area/Index, Local Repository). How do they relate?

6. What is a "commit" in Git? What information does a commit contain?

7. What makes a good commit message?

8. How do you initialize a new Git repository?

9. Explain the purpose of `git add` and `git commit`.

10. How do you check the status of your Git repository?

11. What is the `.git` directory? What does it contain?

12. How do you view your commit history?

13. Name a few useful `git log` options.

14. What is the `HEAD` in Git?

---

## II. Branching and Merging

15. What is a "branch" in Git, and why are branches used?

16. What are the advantages of using feature branches?

17. How do you create a new branch and switch to it?

18. Explain the difference between `git merge` and `git rebase`. When would you choose one over the other?

19. What is a "fast-forward merge"?

20. What is a "merge conflict"? How do you resolve one?

21. What happens when you merge a branch that has diverged from its base branch?

22. How do you delete a local branch?

23. What's the difference between `-d` and `-D`?

24. What is a "detached HEAD" state, and how can you get out of it?

---

## III. Remote Repositories & Collaboration (GitHub Specifics)

25. What is a "remote" in Git? What is `origin`?

26. How do you connect your local repository to a remote repository on GitHub?

27. Explain the difference between `git fetch`, `git pull`, and `git push`.

28. What is a "Pull Request" (PR) on GitHub? Explain its typical workflow.

29. What are the benefits of using Pull Requests for code review?

30. How do you clone a repository from GitHub?

31. How do you push a new local branch to GitHub?

32. How do you delete a remote branch on GitHub?

33. What is the purpose of a `.gitignore` file?

34. Provide an example of what you might put in `.gitignore` for a Java project.

35. What are "forking" and "cloning" on GitHub, and when would you use each?

---

## IV. Undoing Changes & Advanced Concepts

36. How do you undo changes in your working directory that have not yet been staged?

37. How do you unstage a file that has been added to the staging area but not yet committed?

38. Explain the difference between `git reset` and `git revert`. When would you use each?

39. What are the different modes of `git reset` (`--soft`, `--mixed`, `--hard`)? When would you use `--hard`?

40. What is `git stash`? When would you use it?

41. How do you apply stashed changes?

42. What is `git cherry-pick`? When is it useful?

43. Explain the concept of `git reflog` and its utility.

44. What are Git tags, and why are they used?

45. How do you create and push Git tags?

46. How would you find a specific change made by a particular author or within a specific date range in Git history?

47. Imagine you accidentally committed sensitive information (like an API key) and pushed it to GitHub. How would you remove it from the repository's history?

> 💡 Hint: `git filter-branch` or **BFG Repo-Cleaner**

---

## V. Scenario-Based / Problem Solving

48. You've made several commits on your feature branch, but now realize the first commit had a typo in its message. How would you correct it without affecting subsequent commits, assuming you haven't pushed the branch yet?

49. You're working on a feature branch, and the `main` branch has received critical bug fixes. How would you incorporate those bug fixes into your feature branch without merging your feature branch into `main` prematurely?

50. Your colleague pushed a change that broke the build. How would you quickly revert their change and get the build working again, without losing their work entirely?

51. You have untracked files and some staged changes, but you need to immediately switch to another branch to fix a hotfix. What Git command would you use to temporarily save your current work?

52. Describe a time you encountered a complex merge conflict. How did you resolve it? What tools or strategies did you use?

53. How do you ensure your local `main` branch is always up-to-date with the `main` branch on GitHub?

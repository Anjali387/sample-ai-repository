# Merge Conflict repositories

---

## Universal Fix Command

Every developer with a conflicting PR runs the following on their local machine:

```bash
git fetch origin
git checkout <their-branch-name>
git rebase origin/main
# If conflicts appear, resolve them in the files, then:
git add .
git rebase --continue
# Repeat until rebase is done, then:
git push --force-with-lease origin <their-branch-name>
```

---

## Per-Repository Instructions

---

### 1. `sentineliq-unified-command-centre` — 16 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #34 | day5 and day6 | `sainath` |
| #28 | Day 14 — Final prompt QA | `lakshmi-day14` |
| #27 | Day 13 — AI fallback on timeout/error | `lakshmi-day13` |
| #23 | Feature/ai dev3 day 11 13 | `feature/ai-dev3-day-11-13` |
| #22 | Feature/ai dev3 day 14 | `feature/ai-dev3-day-14` |
| #21 | Feature/ai dev3 day 2 | `feature/ai-dev3-day-2` |
| #20 | Feature/ai dev3 day 3 | `feature/ai-dev3-day-3` |
| #19 | Feature/ai dev3 day 4 | `feature/ai-dev3-day-4` |
| #18 | Feature/ai dev3 day 5 | `feature/ai-dev3-day-5` |
| #17 | Feature/ai dev3 day 6 | `feature/ai-dev3-day-6` |
| #16 | Feature/ai dev3 day 7 | `feature/ai-dev3-day-7` |
| #15 | Feature/ai dev3 day 8 | `feature/ai-dev3-day-8` |
| #14 | Feature/ai dev3 day 9 | `feature/ai-dev3-day-9` |
| #13 | Feature/ai dev3 day 10 | `feature/ai-dev3-day-10` |
| #12 | Day 1 — Repo analysis, Setup ai-service | `feature/ai-dev3-day-1` |
| #11 | Day 9 — Added meta object with cache tracking | `lakshmi-day9-final` |

**Fix:**
```bash
git fetch origin
git checkout <branch>
git rebase origin/main
git push --force-with-lease origin <branch>
```

> **Note:** For the `feature/ai-dev3-day-*` chain — rebase from Day 1 upward in order. Once #12 (day-1) is rebased and merged, rebase #13 (day-10) on top of that, and so on.

---

### 2. `compliance-obligation-register` — 13 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #24 | Day 19: Final Hotfix and Demo Readiness | `day19` |
| #23 | Day 18: Project Verification and Setup Validation | `day18` |
| #22 | Day 17: Demo Rehearsal Fixes | `day17` |
| #21 | Day 16: Final Bug Fixes and Stabilization | `day16` |
| #20 | Day 15: Final Merge and Production Ready | `day15` |
| #19 | Day 14: Performance Optimization | `day14` |
| #18 | Day 13: Bug Fixes and System Testing | `day13` |
| #17 | Day 12: Docker Compose Setup | `day12` |
| #16 | Day 11: Full Integration Testing using Testcontainers | `day11` |
| #15 | Day 10: Integration Testing using MockMvc | `day10` |
| #14 | Day 9: Pagination & CSV Export | `day9` |
| #13 | Day 8: Audit logging using AOP | `day8` |
| #12 | Day 7: Email Notification & Scheduled Alert System | `day7` |

**Fix (rebase in order — Day 7 first):**
```bash
# Rebase each branch in sequence: day7 → day8 → ... → day19
git fetch origin
git checkout day7 && git rebase origin/main && git push --force-with-lease origin day7
git checkout day8 && git rebase origin/day7 && git push --force-with-lease origin day8
# Continue for day9 through day19...
```

---

### 3. `threat-intelligence-platform` — 12 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #27 | Day 3 | `day-3` |
| #26 | Day 4 | `day-4` |
| #25 | Day 5 | `day-5` |
| #24 | Day 6 | `day-6` |
| #23 | Day 7 | `day-7` |
| #22 | Day 8 | `day-8` |
| #21 | Day 9 | `day-9` |
| #20 | Day 10 | `day-10` |
| #19 | Day 11 | `day-11` |
| #18 | Day 12 | `day-12` |
| #17 | Day 13 | `day-13` |
| #14 | Day 2 (janani) | `day2-janani` |

**Fix:**
```bash
git fetch origin
git checkout day-3 && git rebase origin/main && git push --force-with-lease origin day-3
# Repeat for day-4 through day-13 in order
git checkout day2-janani && git rebase origin/main && git push --force-with-lease origin day2-janani
```

---

### 4. `post-incident-review-system` — 9 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #28 | Day 12: Final Submission v1.0 | `main` |
| #27 | Day 11 - Responsive UI & Performance Optimization | `srujan-day11` |
| #26 | Day 10 - Data Seeder & Analytics Dashboard | `srujan-day10` |
| #25 | Day 9 - Swagger, CSV Export & File Upload | `srujan-day9` |
| #24 | Day 8 - Testing & AI Panel Integration | `srujan-day8` |
| #23 | Day 7 - Date Range Filtering & Bug Fixes | `srujan-day7` |
| #21 | Day 10 and Day 11 - Integration testing | `priya-java-dev-1` |
| #20 | Week 2 - Day 8 task completed | `ai-developer-2` |
| #19 | Day 6 – Incident Management Module | `day6-complete` |

**Fix:**
```bash
git fetch origin
# For srujan's chain (rebase in order):
git checkout srujan-day7 && git rebase origin/main && git push --force-with-lease origin srujan-day7
git checkout srujan-day8 && git rebase origin/main && git push --force-with-lease origin srujan-day8
# Continue for srujan-day9 through srujan-day11...

# For individual developers:
git checkout priya-java-dev-1 && git rebase origin/main && git push --force-with-lease origin priya-java-dev-1
git checkout ai-developer-2 && git rebase origin/main && git push --force-with-lease origin ai-developer-2
git checkout day6-complete && git rebase origin/main && git push --force-with-lease origin day6-complete

# PR #28 is targeting main — developer needs to rebase their local main fork
```

---

### 5. `multi-tenant-admin-portal` — 5 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #10 | Day 6: Generate Report API with structured response | `patch-3` |
| #8 | Create AiIntegrationService.java | `patch-4` |
| #7 | Create AiIntegrationService.java | `patch-2` |
| #6 | Day 0-12 - re-initialized portal with full frontend | `main` |
| #5 | Day 9 to Day 20 - Security sign-off | `ai-dev-2-setup` |

**Fix:**
```bash
git fetch origin
git checkout patch-2 && git rebase origin/main && git push --force-with-lease origin patch-2
git checkout patch-3 && git rebase origin/main && git push --force-with-lease origin patch-3
git checkout patch-4 && git rebase origin/main && git push --force-with-lease origin patch-4
git checkout ai-dev-2-setup && git rebase origin/main && git push --force-with-lease origin ai-dev-2-setup
# PR #6 targets main — developer needs to sync their fork with upstream
```

---

### 6. `data-subject-rights-portal` — 4 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #16 | Day 12–15: Backend + Admin UI + Search | `day14-clean` |
| #15 | Day 12-13: Completed backend features | `day13-submission` |
| #13 | Day 9 - JWT Authentication Implementation | `main` |
| #6 | Day 1 to Day 5 task completed | `main` |

**Fix:**
```bash
git fetch origin
git checkout day13-submission && git rebase origin/main && git push --force-with-lease origin day13-submission
git checkout day14-clean && git rebase origin/main && git push --force-with-lease origin day14-clean
# PRs targeting main — developers need to create a feature branch from latest main
```

---

### 7. `vendor-nda-tracker` — 3 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #24 | Day 10 — Added AI service README | `angel-day10` |
| #22 | Day 8 — Fixed ZAP findings | `angel-day8th` |
| #21 | Day 13 — Final Security Sign-off | `day13-security-signoff` |

**Fix:**
```bash
git fetch origin
git checkout angel-day8th && git rebase origin/main && git push --force-with-lease origin angel-day8th
git checkout angel-day10 && git rebase origin/main && git push --force-with-lease origin angel-day10
git checkout day13-security-signoff && git rebase origin/main && git push --force-with-lease origin day13-security-signoff
```

---

### 8. `risk-reporting-suite` — 3 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #45 | Week3 day5 docker packaging | `week3-day5-docker-packaging` |
| #44 | Week3 day4 final prompt qa | `week3-day4-final-prompt-qa` |
| #38 | Cleaned structure: removed nested folder | `main` |

**Fix:**
```bash
git fetch origin
git checkout week3-day4-final-prompt-qa && git rebase origin/main && git push --force-with-lease origin week3-day4-final-prompt-qa
git checkout week3-day5-docker-packaging && git rebase origin/main && git push --force-with-lease origin week3-day5-docker-packaging
# PR #38 targets main — developer needs to create a feature branch
```

---

### 9. `risk-appetite-framework` — 3 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #12 | completed day 13 tasks | `main` |
| #8 | Day 10 - REST API Completed | `prajwaljs` |
| #7 | Syeda Ayesha AI-developer-1 | `Syeda-Ayesha-ai1-dev` |

**Fix:**
```bash
git fetch origin
git checkout prajwaljs && git rebase origin/main && git push --force-with-lease origin prajwaljs
git checkout Syeda-Ayesha-ai1-dev && git rebase origin/main && git push --force-with-lease origin Syeda-Ayesha-ai1-dev
# PR #12 targets main — developer needs to create a feature branch from latest main
```

---

### 10. `internal-controls-testing-platform` — 3 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #12 | Week 4 — AI Developer 1 — Days 16 to 20 | `week-4-ai-dev-1` |
| #11 | Week 3 — AI Developer 1 — Days 11 to 15 | `week-3-ai-dev-1` |
| #10 | Week 2 Part 2 — AI Developer 1 — Days 8, 9 and 10 | `week-2-ai-dev-1-part2` |

**Fix (rebase in order):**
```bash
git fetch origin
git checkout week-2-ai-dev-1-part2 && git rebase origin/main && git push --force-with-lease origin week-2-ai-dev-1-part2
git checkout week-3-ai-dev-1 && git rebase origin/main && git push --force-with-lease origin week-3-ai-dev-1
git checkout week-4-ai-dev-1 && git rebase origin/main && git push --force-with-lease origin week-4-ai-dev-1
```

---

### 11. `external-audit-coordinator` — 3 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #10 | Prajwal | `prajwal` |
| #9 | risk mitigations | `shivakumar_BV` |
| #7 | Day 20 — Controller Testing + CI | `main` |

**Fix:**
```bash
git fetch origin
git checkout prajwal && git rebase origin/main && git push --force-with-lease origin prajwal
git checkout shivakumar_BV && git rebase origin/main && git push --force-with-lease origin shivakumar_BV
# PR #7 targets main — developer needs to create a feature branch
```

---

### 12. `risk-register-import-export-tool` — 2 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #5 | Week 2 - Thursday Completed | `akashdg-ai-developer1` |
| #4 | #1 - Initial setup with Flyway migration | `main` |

**Fix:**
```bash
git fetch origin
git checkout akashdg-ai-developer1 && git rebase origin/main && git push --force-with-lease origin akashdg-ai-developer1
# PR #4 targets main — developer needs to create a feature branch
```

---

### 13. `risk-assessment-engine` — 2 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #13 | Day 1 - Day 5 Implementation | `ayesha-ai1-new` |
| #11 | Full Project Update — Risk Assessment Engine (Day 1–17) | `Sanjanad-aidev3` |

**Fix:**
```bash
git fetch origin
git checkout ayesha-ai1-new && git rebase origin/main && git push --force-with-lease origin ayesha-ai1-new
git checkout Sanjanad-aidev3 && git rebase origin/main && git push --force-with-lease origin Sanjanad-aidev3
```

---

### 14. `regulatory-policy-alignment` — 2 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #21 | Secured API endpoints with JWT and Rate Limiting | `main` |
| #19 | Day 10/11: Full integration testing | `java-dev-1-Pooja_Malakapure` |

**Fix:**
```bash
git fetch origin
git checkout java-dev-1-Pooja_Malakapure && git rebase origin/main && git push --force-with-lease origin java-dev-1-Pooja_Malakapure
# PR #21 targets main — developer needs to create a feature branch
```

---

### 15. `incident-response-orchestrator` — 2 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #7 | AI developer 1 | `ai_developer_1` |
| #4 | Frontend — Day 8 to Day 13 | `chandana` |

**Fix:**
```bash
git fetch origin
git checkout ai_developer_1 && git rebase origin/main && git push --force-with-lease origin ai_developer_1
git checkout chandana && git rebase origin/main && git push --force-with-lease origin chandana
```

---

### 16. `crisis-communication-manager` — 2 conflicting PRs

| PR | Title | Branch |
|----|-------|--------|
| #19 | Day 12 | `Day12` |
| #18 | Day 11 - Added DB indexes, optimized queries | `Day11` |

**Fix:**
```bash
git fetch origin
git checkout Day11 && git rebase origin/main && git push --force-with-lease origin Day11
git checkout Day12 && git rebase origin/main && git push --force-with-lease origin Day12
```

---

### 17. `whistleblower-ethics-hotline` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #7 | Day 10 — AI Service (clean, no secrets, rebased) | `sanjan_gowda` |

**Fix:**
```bash
git fetch origin && git checkout sanjan_gowda && git rebase origin/main && git push --force-with-lease origin sanjan_gowda
```

---

### 18. `vulnerability-management-hub` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #12 | Day 7 — Email notifications | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 19. `vendor-risk-scorecard-generator` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #7 | Day 5: AI Integration | `day5-ai-integration` |

**Fix:**
```bash
git fetch origin && git checkout day5-ai-integration && git rebase origin/main && git push --force-with-lease origin day5-ai-integration
```

---

### 20. `vendor-risk-assessment` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #12 | Day 11 - Java Developer 2 | `day11-testing-containers` |

**Fix:**
```bash
git fetch origin && git checkout day11-testing-containers && git rebase origin/main && git push --force-with-lease origin day11-testing-containers
```

---

### 21. `sentineliq-notification-engine` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #3 | AI Developer 2 — Week 1 & 2 Complete (Day 1-10) | `ai-developer-2` |

**Fix:**
```bash
git fetch origin && git checkout ai-developer-2 && git rebase origin/main && git push --force-with-lease origin ai-developer-2
```

---

### 22. `role-permission-manager` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #4 | added new files and updates | `lavanya` |

**Fix:**
```bash
git fetch origin && git checkout lavanya && git rebase origin/main && git push --force-with-lease origin lavanya
```

---

### 23. `risk-treatment-planner` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #10 | Added email notifications | `darshana_d_s` |

**Fix:**
```bash
git fetch origin && git checkout darshana_d_s && git rebase origin/main && git push --force-with-lease origin darshana_d_s
```

---

### 24. `risk-culture-survey-tool` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #15 | Day 10 Testing Implementation - MockMvc Integration Tests | `feature/day10-mockmvc-tests` |

**Fix:**
```bash
git fetch origin && git checkout feature/day10-mockmvc-tests && git rebase origin/main && git push --force-with-lease origin feature/day10-mockmvc-tests
```

---

### 25. `regulatory-inspection-manager` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #5 | Day 1 — Added Flyway V1 migration | `sindhu-java2` |

**Fix:**
```bash
git fetch origin && git checkout sindhu-java2 && git rebase origin/main && git push --force-with-lease origin sindhu-java2
```

---

### 26. `regulatory-filing-automation` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | Day 7 — OWASP ZAP baseline scan | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 27. `regulatory-deadline-countdown-widget` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #3 | Day 10 — Analytics page with charts | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 28. `regulatory-change-management` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #11 | feat: complete analytics dashboard and AI streaming UI | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 29. `policy-version-diff-viewer` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | Day 9 — Week 2 security sign-off | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 30. `policy-lifecycle-manager` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #1 | Rajatha | `rajatha` |

**Fix:**
```bash
git fetch origin && git checkout rajatha && git rebase origin/main && git push --force-with-lease origin rajatha
```

---

### 31. `policy-compliance-testing` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #7 | Day 11-12-13 completed | `rachana-java-developer-2` |

**Fix:**
```bash
git fetch origin && git checkout rachana-java-developer-2 && git rebase origin/main && git push --force-with-lease origin rachana-java-developer-2
```

---

### 32. `operational-loss-calculator` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | Operational Loss Calculator - Full Stack Application | `samarth` |

**Fix:**
```bash
git fetch origin && git checkout samarth && git rebase origin/main && git push --force-with-lease origin samarth
```

---

### 33. `kri-dashboard` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #8 | Java Developer 1 — Days 7 to 16 completed | `ujwal-warad` |

**Fix:**
```bash
git fetch origin && git checkout ujwal-warad && git rebase origin/main && git push --force-with-lease origin ujwal-warad
```

---

### 34. `grc-onboarding-wizard` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #19 | Day 11 | `karthikgbhat` |

**Fix:**
```bash
git fetch origin && git checkout karthikgbhat && git rebase origin/main && git push --force-with-lease origin karthikgbhat
```

---

### 35. `grc-health-score-calculator` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #5 | AI Developer 2 | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 36. `esg-risk-integrator` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #8 | Day 10 — Documentation and API Reference | `day10-readme` |

**Fix:**
```bash
git fetch origin && git checkout day10-readme && git rebase origin/main && git push --force-with-lease origin day10-readme
```

---

### 37. `esg-benchmark-comparator` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #7 | final push | `rahul-day1` |

**Fix:**
```bash
git fetch origin && git checkout rahul-day1 && git rebase origin/main && git push --force-with-lease origin rahul-day1
```

---

### 38. `emerging-risk-monitor` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #14 | completed Day 4 CRUD and Day 5 validation | `sneha` |

**Fix:**
```bash
git fetch origin && git checkout sneha && git rebase origin/main && git push --force-with-lease origin sneha
```

---

### 39. `dpdp-act-consent-audit-trail` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | Day 8 - Started with the backend Spring boot implementation | `jayanth-java-dev2` |

**Fix:**
```bash
git fetch origin && git checkout jayanth-java-dev2 && git rebase origin/main && git push --force-with-lease origin jayanth-java-dev2
```

---

### 40. `dpdp-act-compliance-centre` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #3 | Day 2 to 4 - /describe and /recommend endpoints with Groq | `GaneshMulgund-AIdeveloper1` |

**Fix:**
```bash
git fetch origin && git checkout GaneshMulgund-AIdeveloper1 && git rebase origin/main && git push --force-with-lease origin GaneshMulgund-AIdeveloper1
```

---

### 41. `data-breach-response-manager` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | day 3 | `sunil` |

**Fix:**
```bash
git fetch origin && git checkout sunil && git rebase origin/main && git push --force-with-lease origin sunil
```

---

### 42. `cyber-asset-discovery-scanner` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #8 | Complete Day 8 MockMvc tests and AI panel UI | (check locally) |

**Fix:**
```bash
git fetch origin && git rebase origin/main && git push --force-with-lease
```

---

### 43. `control-effectiveness-rater` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #5 | Day 13 - demo video added | `ruchitha` |

**Fix:**
```bash
git fetch origin && git checkout ruchitha && git rebase origin/main && git push --force-with-lease origin ruchitha
```

---

### 44. `continuous-control-monitoring` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #12 | Day 6 - Implemented RAG-powered report generation API | `Karthik-Hugar` |

**Fix:**
```bash
git fetch origin && git checkout Karthik-Hugar && git rebase origin/main && git push --force-with-lease origin Karthik-Hugar
```

---

### 45. `compliance-health-dashboard` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #9 (check) | (new PR) | (check locally) |

**Fix:**
```bash
git fetch origin && git rebase origin/main && git push --force-with-lease
```

---

### 46. `compliance-calendar-tracker` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #22 | Day 6–Day 10 Backend Enhancement Tasks | `main` |

**Fix:** Developer needs to create a feature branch from latest `main` and re-push their changes.

---

### 47. `audit-execution-workspace` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #14 | Performance benchmarking and latency analysis | `ridhmishra-day12` |

**Fix:**
```bash
git fetch origin && git checkout ridhmishra-day12 && git rebase origin/main && git push --force-with-lease origin ridhmishra-day12
```

---

### 48. `audit-committee-reporting` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #2 | JWT enforcement, rate limiting, injection rejection | `feature/deepika-audit` |

**Fix:**
```bash
git fetch origin && git checkout feature/deepika-audit && git rebase origin/main && git push --force-with-lease origin feature/deepika-audit
```

---

### 49. `analytics-bi-engine` — 1 conflicting PR

| PR | Title | Branch |
|----|-------|--------|
| #11 | JD1 Day 5 — JWT Authentication and API Security | `saniha-jd5-clean` |

**Fix:**
```bash
git fetch origin && git checkout saniha-jd5-clean && git rebase origin/main && git push --force-with-lease origin saniha-jd5-clean
```

---

## PRs Pushing Directly to `main` — Special Note

Several developers are pushing PRs with `main` as the source branch. This causes conflicts and is bad practice. These developers should:

1. Create a new branch from the latest `main`:
   ```bash
   git fetch origin
   git checkout main
   git pull origin main
   git checkout -b <your-name>-feature
   git cherry-pick <your-commit-hashes>
   git push origin <your-name>-feature
   ```
2. Open a new PR from that branch.
3. Close the old conflicting PR.

**Affected repos:** `post-incident-review-system`, `regulatory-change-management`, `regulatory-deadline-countdown-widget`, `regulatory-filing-automation`, `policy-version-diff-viewer`, `grc-health-score-calculator`, `risk-appetite-framework` (#12), `compliance-calendar-tracker` (#22), `vulnerability-management-hub` (#12), `risk-register-import-export-tool` (#4), `data-subject-rights-portal` (#13), `regulatory-policy-alignment` (#21), `external-audit-coordinator` (#7), `risk-reporting-suite` (#38).

---

## After Rebasing

Once any developer has rebased and force-pushed their branch, notify the project admin to re-run the approve and merge pass, or the PR will automatically become mergeable and can be merged directly from GitHub.
